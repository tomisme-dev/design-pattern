package com.youaiduan.chapter19.composite;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Composite extends Component {
	private List<Component> children = new LinkedList<>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) throws ComponentOperateException {
		children.add(component);
	}

	@Override
	public void remove(Component component) throws ComponentOperateException {
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		System.out.println(StringUtils.repeat('-', depth) + name);
		for (Component component : children) {
			component.display(depth + 2);
		}
	}


}
