package com.dosonping.design_patterns.state;
public interface State {
	public void handlePush(Context context);
	public void handlePull(Context context);
	public String getColor(); 
}
