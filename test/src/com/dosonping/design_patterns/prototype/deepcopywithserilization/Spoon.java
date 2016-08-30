package com.dosonping.design_patterns.prototype.deepcopywithserilization;

import java.io.Serializable;

public class Spoon implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
