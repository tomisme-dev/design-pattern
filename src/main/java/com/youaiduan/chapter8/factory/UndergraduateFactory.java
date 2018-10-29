package com.youaiduan.chapter8.factory;

import com.youaiduan.chapter8.factory.person.LeiFeng;
import com.youaiduan.chapter8.factory.person.Undergraduate;

public class UndergraduateFactory implements ILeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}
	
}
