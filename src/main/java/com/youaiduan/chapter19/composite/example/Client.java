package com.youaiduan.chapter19.composite.example;

public class Client {

	public Client() {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总部财务部"));
		
		ConcreteCompany shanghai = new ConcreteCompany("上海华东分公司");
		shanghai.add(new HRDepartment("上海华东人力资源部"));
		shanghai.add(new FinanceDepartment("上海华东财务部"));
		root.add(shanghai);
		
		root.display(1);
		root.lineOfDuty();
		
	}
	
	public static void main(String[] args) {
		new Client();
	}

}
