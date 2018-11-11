package com.youaiduan.chapter19.composite.example;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

import org.apache.commons.lang3.StringUtils;

public class ConcreteCompany extends Company {
	private List<Company> children = new LinkedList<>();

	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub
		children.add(company);
	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub
		children.remove(company);
	}

	@Override
	public void display(int depth) {
		System.out.println(StringUtils.repeat('-', depth) + name);
		children.forEach(c -> c.display(depth + 2));
	}

	@Override
	public void lineOfDuty() {
		children.forEach(c -> c.lineOfDuty());
	}

}
