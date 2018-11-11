package com.youaiduan.chapter19.composite;

import org.apache.commons.lang3.StringUtils;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) throws ComponentOperateException {
		throw new ComponentOperateException("Ҷ�ӽڵ㲻������ӽڵ�");
	}

	@Override
	public void remove(Component component) throws ComponentOperateException {
		throw new ComponentOperateException("Ҷ�ӽڵ㲻��ɾ���ӽڵ�");
	}

	@Override
	public void display(int depth) {
		System.out.println(StringUtils.repeat('-', depth) + name);
	}


}
