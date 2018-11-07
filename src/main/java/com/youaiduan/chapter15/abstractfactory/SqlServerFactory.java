package com.youaiduan.chapter15.abstractfactory;

public class SqlServerFactory implements Factory {

	@Override
	public IUser createIUser() {
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}

}
