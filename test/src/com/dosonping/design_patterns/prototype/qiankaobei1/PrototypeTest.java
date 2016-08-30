package com.dosonping.design_patterns.prototype.qiankaobei1;
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
//		testPrototype();
		//浅拷贝
		testPrototype2();
	}
	
	private static void testPrototype2() throws CloneNotSupportedException {
		AbstractSpoon spoon = new AbstractSpoon();
		spoon.setSpoonName("原对象");
		AbstractSpoon spoon2 = (AbstractSpoon)spoon.clone();
		spoon2.setSpoonName("克隆的对象");
		System.out.println("愿对象：" + spoon.getSpoonName());
		System.out.println("更改的对象：" + spoon2.getSpoonName());
	}

	private static void testPrototype() throws CloneNotSupportedException {
		AbstractSpoon spoon = new SaladSpoon();
		AbstractSpoon spoon2 = new SoupSpoon();
		AbstractSpoon saladSpoon = (AbstractSpoon)spoon.clone();
		System.out.println(saladSpoon.getSpoonName());
		AbstractSpoon soupSpoon = (AbstractSpoon)spoon2.clone();
		System.out.println(soupSpoon.getSpoonName());
	}
	

	
}
