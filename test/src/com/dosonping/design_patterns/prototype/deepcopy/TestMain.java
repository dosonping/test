package com.dosonping.design_patterns.prototype.deepcopy;
public class TestMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		testDeepCopy();
	}

	private static void testDeepCopy() throws CloneNotSupportedException {
		Spoon spoon = new Spoon();
		spoon.setName("原勺子");
		NewSpoon newSpoon = new NewSpoon();
		newSpoon.setId("新勺子ID");
		newSpoon.setSpoon(spoon);
		NewSpoon copyNewSpoon = (NewSpoon) newSpoon.clone();
		copyNewSpoon.setId("copy的新勺子ID");
		copyNewSpoon.getSpoon().setName("克隆的勺子");
		
		System.out.println("原勺子ID:"+newSpoon.getId());
		System.out.println("原勺子Name:"+newSpoon.getSpoon().getName());
		
		System.out.println("克隆的勺子ID:"+copyNewSpoon.getId());
		System.out.println("克隆的勺子Name:"+copyNewSpoon.getSpoon().getName());
		
	}
}
