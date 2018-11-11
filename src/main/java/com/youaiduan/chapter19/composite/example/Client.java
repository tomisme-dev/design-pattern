package com.youaiduan.chapter19.composite.example;

public class Client {

	public Client() {
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܲ�����"));
		
		ConcreteCompany shanghai = new ConcreteCompany("�Ϻ������ֹ�˾");
		shanghai.add(new HRDepartment("�Ϻ�����������Դ��"));
		shanghai.add(new FinanceDepartment("�Ϻ���������"));
		root.add(shanghai);
		
		root.display(1);
		root.lineOfDuty();
		
	}
	
	public static void main(String[] args) {
		new Client();
	}

}
