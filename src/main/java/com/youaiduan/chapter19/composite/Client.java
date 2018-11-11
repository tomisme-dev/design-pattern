package com.youaiduan.chapter19.composite;

public class Client {
	public static void main(String[] args) throws ComponentOperateException {
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite compX = new Composite("composite X");
		compX.add(new Leaf("Leaf XA"));
		compX.add(new Leaf("Leaf XB"));
		root.add(compX);
		
		Composite composite = new Composite("Composite XY");
		composite.add(new Leaf("Leaf XYA"));
		composite.add(new Leaf("Leaf XYB"));
		compX.add(composite);
		
		root.add(new Leaf("Leaf C"));
		
		Leaf leafD = new Leaf("Leaf D");
		root.add(leafD);
		
		root.display(1);
	}
}
