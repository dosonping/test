package com.dosonping.design_patterns.prototype.qiankaobei1;
/**
 * Java原型模式（Prototype模式）
 * @author dosonping
 *
 */
public class AbstractSpoon implements Cloneable{
	String spoonName;

	public String getSpoonName() {
		return spoonName;
	}

	public void setSpoonName(String spoonName) {
		this.spoonName = spoonName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("AbstractSpoon is not Cloneable");
			e.printStackTrace();
		}
		
		return object;
//		return super.clone();
	}
}
