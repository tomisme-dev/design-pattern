package com.youaiduan.chapter22.bridge;

// �ֻ����
public interface HandsetSoft {
	void run();
}


class HandsetGame implements HandsetSoft {

	@Override
	public void run() {
		System.out.println("�����ֻ���Ϸ");
		
	}
	
}

class HandsetAddressList implements HandsetSoft {

	@Override
	public void run() {
		System.out.println("����ͨѶ¼");
	}
	
}