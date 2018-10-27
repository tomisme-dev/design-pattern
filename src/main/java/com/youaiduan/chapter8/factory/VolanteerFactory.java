package com.youaiduan.chapter8.factory;

import com.youaiduan.chapter8.factory.person.LeiFeng;
import com.youaiduan.chapter8.factory.person.Volunteer;

public class VolanteerFactory implements ILeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
