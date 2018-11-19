package com.youaiduan.chapter28.visitor;

public class Success extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(String.format("%s%sʱ,��������һ���ɹ���Ů��", man.getClass().getName(), this.getClass().getName()));
	}

	@Override
	public void getWomancolusion(Woman woman) {
		System.out.println(String.format("%s%sʱ,��������һ�����ɹ�������", woman.getClass().getName(), this.getClass().getName()));
	}

}

class Failing extends Action {

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("����ʧ��");
	}

	@Override
	public void getWomancolusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("Ů��ʧ��");
	}
}


class Amativeness extends Action {

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("����̸����ʱ");
	}

	@Override
	public void getWomancolusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("Ů��̸����ʱ");
	}
	
}

class Married extends Action {

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("���˽��ʱ:");
	}

	@Override
	public void getWomancolusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("Ů�˽��ʱ");
	}
	
}