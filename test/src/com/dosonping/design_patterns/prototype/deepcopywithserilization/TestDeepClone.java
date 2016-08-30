package com.dosonping.design_patterns.prototype.deepcopywithserilization;
public class TestDeepClone {
	public static void main(String[] args) {
		Spoon spoon = new Spoon();
		spoon.setName("新勺子");
		NewSpoon newSpoon = new NewSpoon();
		newSpoon.setSpoon(spoon);
		
		NewSpoon copyNewSpoon = (NewSpoon) newSpoon.deepClone();
		copyNewSpoon.getSpoon().setName("克隆的勺子");
		
		System.out.println("原勺子Name: "+ newSpoon.getSpoon().getName());
		System.out.println("克隆的勺子Name: "+ copyNewSpoon.getSpoon().getName());
	}
}
