package com.youaiduan.chapter18.memento;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
//		��սbossǰ
		GameRole tom = new GameRole();
		tom.stateDisplay();
		
//		������Ϸ����
//		GameRole backup = (GameRole) tom.clone();
		
//		��ʼ��ս
		tom.fight();
		tom.stateDisplay();
//		����һ��
		tom.backup();
		
		
		tom.fight();
		tom.stateDisplay();
		tom.fight();
		tom.stateDisplay();
		
//		�ָ�ս��ǰ״̬
		tom.recovery();
		tom.stateDisplay();
		
		System.out.println("finish");
		
	}
}
