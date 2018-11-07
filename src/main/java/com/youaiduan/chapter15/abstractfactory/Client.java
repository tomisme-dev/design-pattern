package com.youaiduan.chapter15.abstractfactory;

public class Client {
	public static void main(String[] args) {
		Factory factory = new SqlServerFactory();
		
		IUser iUser = factory.createIUser();
		iUser.getUser(12);
		iUser.insert(new User(15, "jerry"));
		
		IDepartment department = factory.createDepartment();
		department.getDepartment(88);
		department.insert(new Department(66, "²Ôñ·"));
		
		Factory myFactory = Factory.getFactory();
	}
}
