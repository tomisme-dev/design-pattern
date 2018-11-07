package com.youaiduan.chapter15.abstractfactory;

public class DataAccess {
	private static Factory factory = Factory.getFactory();
	
	public static IUser createIUser() {
		return factory.createIUser();
	}
	
	public static IDepartment createIDepartment() {
		return factory.createDepartment();
	}
	
	public static void main(String[] args) {
		IDepartment iDepartment = DataAccess.createIDepartment();
		IUser iUser = DataAccess.createIUser();
		iDepartment.getDepartment(45);
		iUser.getUser(78);
	}
	
	public static Factory getFactory() {
		return new AccessFactory();
	}
}
