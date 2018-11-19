package com.youaiduan.chapter28.visitor;

public class Success extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(String.format("%s%s时,背后多半有一个成功的女人", man.getClass().getName(), this.getClass().getName()));
	}

	@Override
	public void getWomancolusion(Woman woman) {
		System.out.println(String.format("%s%s时,背后多半有一个不成功的男人", woman.getClass().getName(), this.getClass().getName()));
	}

}

class Failing extends Action {

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("男人失败");
	}

	@Override
	public void getWomancolusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("女人失败");
	}
}


class Amativeness extends Action {

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("男人谈恋爱时");
	}

	@Override
	public void getWomancolusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("女人谈恋爱时");
	}
	
}

class Married extends Action {

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("男人结婚时:");
	}

	@Override
	public void getWomancolusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("女人结婚时");
	}
	
}