package com.youaiduan.chapter15.abstractfactory;


public class AccessFactory implements Factory{

	@Override
	public IUser createIUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}
	
}
