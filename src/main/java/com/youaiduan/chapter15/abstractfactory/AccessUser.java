package com.youaiduan.chapter15.abstractfactory;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("Access�����û���" + user.getName());
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("Access����û���" + id);
		return new User();
	}

}
