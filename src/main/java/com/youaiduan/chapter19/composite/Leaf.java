package com.youaiduan.chapter19.composite;

import org.apache.commons.lang3.StringUtils;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) throws ComponentOperateException {
		throw new ComponentOperateException("叶子节点不能添加子节点");
	}

	@Override
	public void remove(Component component) throws ComponentOperateException {
		throw new ComponentOperateException("叶子节点不能删除子节点");
	}

	@Override
	public void display(int depth) {
		System.out.println(StringUtils.repeat('-', depth) + name);
	}


}
