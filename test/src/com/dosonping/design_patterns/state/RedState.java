package com.dosonping.design_patterns.state;
public class RedState implements State{

	@Override
	public void handlePush(final Context context) {
		System.out.println(this.getColor());
		final State state = new YellowState();
		context.setState(state);
		state.handlePush(context);
	}

	@Override
	public void handlePull(final Context context) {
		System.out.println(this.getColor());
	}

	@Override
	public String getColor() {
		return "RED";
	}

}
