package com.youaiduan.chapter12.facade;

public class Fund implements ISellAndBuy{
	private Stock1 stock1;
	private Stock2 stock2;
	private NationalDebt1 nationalDebt1;
	
	
	

	public Fund() {
		super();
		stock1 = new Stock1();
		stock2 = new Stock2();
		nationalDebt1 = new NationalDebt1();
	}
	
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		stock1.sell();
		stock2.sell();
		nationalDebt1.sell();
	}
	
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		stock1.buy();
		stock2.buy();
		nationalDebt1.buy();
	}
	
	
	public Stock1 getStock1() {
		return stock1;
	}
	public void setStock1(Stock1 stock1) {
		this.stock1 = stock1;
	}
	public Stock2 getStock2() {
		return stock2;
	}
	public void setStock2(Stock2 stock2) {
		this.stock2 = stock2;
	}
	public NationalDebt1 getNationalDebt1() {
		return nationalDebt1;
	}
	public void setNationalDebt1(NationalDebt1 nationalDebt1) {
		this.nationalDebt1 = nationalDebt1;
	}
	
	public static void main(String[] args) {
		Fund fund = new Fund();
//		购买基金
		fund.buy();
//		赎回基金
		fund.sell();
	}
}
