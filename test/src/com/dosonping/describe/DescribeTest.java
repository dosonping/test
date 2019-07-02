package com.dosonping.describe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import plf.utils.beanutils.PropertyUtils;

public class DescribeTest {
	public static void main(String[] args) {
		Person author = new Person();  
		author.setName("name1");  
		Person author2 = new Person();  
		author2.setName("name2");
		Person author3 = new Person();  
		author3.setName("name3");
		List<Person> l = new ArrayList<Person>();
		l.add(author);
		l.add(author2);
		l.add(author3);
		          
		Book book = new Book();  
		book.setName("Jakarta Commons Cookbook");  
		book.setAuthor(l);  
		Map bookMap = PropertyUtils.describe(book);

	}
}
