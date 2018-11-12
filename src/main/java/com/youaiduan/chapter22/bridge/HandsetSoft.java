package com.youaiduan.chapter22.bridge;

// 手机软件
public interface HandsetSoft {
	void run();
}


class HandsetGame implements HandsetSoft {

	@Override
	public void run() {
		System.out.println("运行手机游戏");
		
	}
	
}

class HandsetAddressList implements HandsetSoft {

	@Override
	public void run() {
		System.out.println("运行通讯录");
	}
	
}