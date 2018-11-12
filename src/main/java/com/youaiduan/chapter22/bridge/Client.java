package com.youaiduan.chapter22.bridge;

public class Client {
	public static void main(String[] args) {
		HandsetBrand hb = new HandsetBrandM();
		HandsetSoft handsetGame = new HandsetGame();
		HandsetSoft handsetAddressList = new HandsetAddressList();
		
		hb.setSoft(handsetGame);
		hb.run();
		hb.setSoft(handsetAddressList);
		hb.run();
	}
}
