package com.youaiduan.chapter23.command;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Waiter {
	private List<Command> commands = new ArrayList<>();
	
	public Waiter() {
		// TODO Auto-generated constructor stub
	}
	
//	设置订单
	public void setOrder(Command command) {
		if(command instanceof MakeChickenWingCommand) {
			System.out.println("鸡翅卖完了");
			return;
		}
		
		commands.add(command);
		System.out.println("增加订单：" + command.getClass() + ", 时间：" + LocalDateTime.now().toString());
	}
	
//	取消订单
	public void cancelOrder(Command command) {
		commands.remove(command);
		System.out.println("取消订单：" + command.getClass() + ", 时间：" + LocalDateTime.now().toString());
	}
	
	public void notification() {
		commands.forEach(c -> c.execute());
	}

}
