package com.dosonping.design_patterns.state;
public class Context {
	private State state = null;

	public State getState() {
		return state;
	}

	public void setState(final State state) {
		this.state = state;
	}
	
	public void push(){
		state.handlePush(this);
	}
	public void pull(){
		state.handlePull(this);
	}
}
