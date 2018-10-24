package com.youaiduan.chapter6.decorator;

public abstract class Decorator extends Component {
	protected Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if(component != null) {			
			component.operation();
		}
	}

}
