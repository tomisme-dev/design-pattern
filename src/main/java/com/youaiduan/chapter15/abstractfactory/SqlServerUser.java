package com.youaiduan.chapter15.abstractfactory;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("sqlServer插入用户：" + user.getName());
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("sqlServer获得用户：" + id);
		return new User();
	}


}
