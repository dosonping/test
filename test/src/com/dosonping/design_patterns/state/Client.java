package com.dosonping.design_patterns.state;
public class Client {
	public static void main(String[] args) {
		final Context context = new Context();
		
		context.setState(new RedState());
		System.out.println("PUSH:");
		context.push();
		System.out.println("\nPULL:");
		context.pull();
	}
}
