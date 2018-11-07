package com.youaiduan.chapter15.abstractfactory;

public class AccessDepartment implements IDepartment{
	@Override
	public void insert(Department department) {
		System.out.println("Access插入部门：" + department.getName());
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("Access获得部门：" + id);
		return null;
	}
}
