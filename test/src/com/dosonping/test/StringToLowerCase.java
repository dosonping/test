package com.dosonping.test;

public class StringToLowerCase {
	public static void main(String[] args) {
		String email = "12CuiR@163.COm";
		email = email.toLowerCase();
		System.out.println(email);
		String substring = email.substring(0, 3);
		
		System.out.println(substring);
	}
}
