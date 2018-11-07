package com.youaiduan.chapter15.abstractfactory;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("Access插入用户：" + user.getName());
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("Access获得用户：" + id);
		return new User();
	}

}
