package com.dosonping.design_patterns.state;
public class GreenState implements State{

	@Override
	public void handlePush(Context context) {
		System.out.println(this.getColor());
	}

	@Override
	public void handlePull(Context context) {
		System.out.println(this.getColor());
		final State state = new YellowState();
		context.setState(state);
		state.handlePull(context);
	}

	@Override
	public String getColor() {
		return "Green";
	}

}
