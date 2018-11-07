package com.youaiduan.chapter15.abstractfactory;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public interface Factory {
	public static Factory getFactory() {
		Properties properties = new Properties();
		InputStream inputStream = Factory.class.getClassLoader().getResourceAsStream("db.prop");
		
		Factory factory = null;
		try {
			properties.load(inputStream);
			String dbClass = properties.getProperty("db");
			factory = (Factory) Class.forName(dbClass).newInstance();
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			factory = new SqlServerFactory();
		}
		return factory;
	}
	
	public IUser createIUser();
	
	public IDepartment createDepartment();
}
