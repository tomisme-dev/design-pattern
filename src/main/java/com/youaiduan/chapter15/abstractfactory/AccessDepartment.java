package com.youaiduan.chapter15.abstractfactory;

public class AccessDepartment implements IDepartment{
	@Override
	public void insert(Department department) {
		System.out.println("Access���벿�ţ�" + department.getName());
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("Access��ò��ţ�" + id);
		return null;
	}
}
