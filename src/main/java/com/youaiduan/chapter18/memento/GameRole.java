package com.youaiduan.chapter18.memento;

import java.util.Random;

public class GameRole implements Cloneable {
//	生命值
	private int vit;
//	攻击力
	private int atk;
//	防御力
	private int def;
	
	public static Random rand = new Random();
	
	private GameRole backup;
	
	public void backup() throws CloneNotSupportedException {
		backup = (GameRole) this.clone();
	}
	
	
	public void recovery() {
		this.vit = backup.vit;
		this.atk = backup.atk;
		this.def = backup.def;
	}
	
	public GameRole() {
		super();
		vit = 100;
		atk = 100;
		def = 100;
	}
	
	public void stateDisplay() {
		System.out.println("===========================================");
		System.out.println("当前角色状态");
		System.out.println("体力：" + vit);
		System.out.println("攻击力：" + atk);
		System.out.println("防御力：" + def);
	}
	
	public void fight() {
		this.vit *= rand.nextDouble();
		this.def *= rand.nextDouble();
		this.atk *= rand.nextDouble();
	}
	
	
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
