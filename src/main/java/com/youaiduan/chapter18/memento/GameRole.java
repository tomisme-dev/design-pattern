package com.youaiduan.chapter18.memento;

import java.util.Random;

public class GameRole implements Cloneable {
//	����ֵ
	private int vit;
//	������
	private int atk;
//	������
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
		System.out.println("��ǰ��ɫ״̬");
		System.out.println("������" + vit);
		System.out.println("��������" + atk);
		System.out.println("��������" + def);
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
