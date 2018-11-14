package com.youaiduan.chapter23.command;

public class MakeMuttonCommond extends Command {

	public MakeMuttonCommond(Barbecuer babecuer) {
		super(babecuer);
	}

	@Override
	public void execute() {
		babecuer.makeMutton();
	}
}

class MakeChickenWingCommand extends Command {

	public MakeChickenWingCommand(Barbecuer babecuer) {
		super(babecuer);
	}

	@Override
	public void execute() {
		babecuer.makeChickenWing();
	}
	
}