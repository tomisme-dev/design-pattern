package com.youaiduan.chapter18.memento;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
//		大战boss前
		GameRole tom = new GameRole();
		tom.stateDisplay();
		
//		保存游戏进度
//		GameRole backup = (GameRole) tom.clone();
		
//		开始大战
		tom.fight();
		tom.stateDisplay();
//		备份一下
		tom.backup();
		
		
		tom.fight();
		tom.stateDisplay();
		tom.fight();
		tom.stateDisplay();
		
//		恢复战斗前状态
		tom.recovery();
		tom.stateDisplay();
		
		System.out.println("finish");
		
	}
}
