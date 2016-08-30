package com.dosonping.design_patterns.prototype.qiankaobei2;
public class NewSpoon implements Cloneable{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	private Spoon spoon;
	
	public Spoon getSpoon() {
		return spoon;
	}

	public void setSpoon(Spoon spoon) {
		this.spoon = spoon;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
