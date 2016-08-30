package com.dosonping.design_patterns.prototype.deepcopy;
public class NewSpoon implements Cloneable{
	private String id;
	private Spoon spoon;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Spoon getSpoon() {
		return spoon;
	}
	public void setSpoon(Spoon spoon) {
		this.spoon = spoon;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		NewSpoon newSpoon = null;
		newSpoon = (NewSpoon) super.clone();
		newSpoon.spoon = (Spoon) this.spoon.clone();
		return newSpoon;
//		return super.clone();
	}
	
}
