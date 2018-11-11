package com.youaiduan.chapter19.composite.example;

import org.apache.commons.lang3.StringUtils;

public class FinanceDepartment extends Company {


	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int depth) {
		System.out.println(StringUtils.repeat('-', depth) + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + "公司财务收支管理");
	}

}
