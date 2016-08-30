package com.dosonping.design_patterns.prototype.qiankaobei2;
public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		testPrototype2();
	}

	private static void testPrototype2() throws CloneNotSupportedException {
		Spoon spoon = new Spoon();
		spoon.setName("原勺子");
		NewSpoon newSpoon = new NewSpoon();
		newSpoon.setId("id1");
		newSpoon.setSpoon(spoon);
		NewSpoon copyNewSpoon = (NewSpoon)newSpoon.clone();
		copyNewSpoon.setId("testCopyId");
		copyNewSpoon.getSpoon().setName("更改的勺子");
		
		System.out.println("原勺子ID：" + newSpoon.getId());
		System.out.println("原勺子Name：" + newSpoon.getSpoon().getName());
		
		System.out.println("克隆的勺子ID：" + copyNewSpoon.getId());
		System.out.println("克隆的勺子Name：" + copyNewSpoon.getSpoon().getName());
		
	}
}
