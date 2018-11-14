package com.youaiduan.chapter23.command;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Waiter {
	private List<Command> commands = new ArrayList<>();
	
	public Waiter() {
		// TODO Auto-generated constructor stub
	}
	
//	���ö���
	public void setOrder(Command command) {
		if(command instanceof MakeChickenWingCommand) {
			System.out.println("����������");
			return;
		}
		
		commands.add(command);
		System.out.println("���Ӷ�����" + command.getClass() + ", ʱ�䣺" + LocalDateTime.now().toString());
	}
	
//	ȡ������
	public void cancelOrder(Command command) {
		commands.remove(command);
		System.out.println("ȡ��������" + command.getClass() + ", ʱ�䣺" + LocalDateTime.now().toString());
	}
	
	public void notification() {
		commands.forEach(c -> c.execute());
	}

}
