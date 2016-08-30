package com.dosonping.test;

import java.util.StringTokenizer;

public class StringFenCi {
	String s = "I am a chinese";
	
	StringTokenizer st = new StringTokenizer(s);
	public static void main(String[] args) {
		String h = "helloabc";
		String t = "he";
		h = h.substring(t.length());
		System.out.println(h);
		StringFenCi fc = new StringFenCi();
		
		while(fc.st.hasMoreTokens()){
			String nextToken = fc.st.nextToken();
			System.out.println(nextToken);
		}
	}
}
