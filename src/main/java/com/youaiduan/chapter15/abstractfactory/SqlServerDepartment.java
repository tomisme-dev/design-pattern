package com.youaiduan.chapter15.abstractfactory;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("sqlServer���벿�ţ�" + department.getName());
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("sqlServer��ò��ţ�" + id);
		return null;
	}

}
