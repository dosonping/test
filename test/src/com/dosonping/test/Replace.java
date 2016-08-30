package com.dosonping.test;

import java.util.UUID;

public class Replace {
	public static void main(String[] args) {
		//System.out.println(UUID.randomUUID().toString().replaceAll("-", "").length());
		String a = "abcd__0";
		String c = "__";
		int lastIndexOf = a.lastIndexOf(c);
		System.out.println(lastIndexOf);
		System.out.println("abcd__0".substring(0,lastIndexOf));
	}
}
