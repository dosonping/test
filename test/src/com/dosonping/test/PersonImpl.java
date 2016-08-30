package com.dosonping.test;
public class PersonImpl implements Person {
	
	public PersonImpl(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String talkTo(String message) {
		if(message.startsWith("hello")){
			return message;
		}
		try {
			throw new IllegalAccessException();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return message;
		
	}

	@Override
	public void walk() {
		for(int i = 0; i<1000;i++){
			System.out.println("walk...." + i);
		}
	}
	private int age;
	private String name;

}
