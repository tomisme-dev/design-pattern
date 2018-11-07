package com.youaiduan.chapter15.abstractfactory;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("sqlServer插入部门：" + department.getName());
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("sqlServer获得部门：" + id);
		return null;
	}

}
