package com.dosonping.design_patterns.state;
public class YellowState implements State{

	@Override
	public void handlePush(Context context) {
		System.out.println(this.getColor());
		final State state = new GreenState();
		context.setState(state);
		state.handlePush(context);
	}

	@Override
	public void handlePull(Context context) {
		System.out.println(this.getColor());
		final State state = new RedState();
		context.setState(state);
		state.handlePull(context);
	}

	@Override
	public String getColor() {
		return "Yellow";
	}

}
