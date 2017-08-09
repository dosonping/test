package com.dosonping.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private Person person;
	@Before
	public void buildPerson(){
		person = new PersonImpl(3,"小明");
	}
	@Test
	public void testGetAge(){
		int age = person.getAge();
		Assert.assertEquals(3, age);
	}
	@Test
	public void testGetName(){
		String name = person.getName();
		Assert.assertEquals("小明", name);
		
	}
	@Test(timeout=200)
	public void testWalk(){
		person.walk();
//		person.walk();
		//Assert.assertEquals("walk...",person.walk(), person);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testTalkTo(){
		String message = person.talkTo("Jimy");
		Assert.assertNotNull(message);
	}
}
