package com.youaiduan.chapter15.abstractfactory;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("sqlServer�����û���" + user.getName());
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("sqlServer����û���" + id);
		return new User();
	}


}
