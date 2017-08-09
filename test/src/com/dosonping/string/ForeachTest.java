package com.dosonping.string;

import java.util.ArrayList;
import java.util.List;

public class ForeachTest {
	public static void main(String[] args) {
		List<String> cc = new ArrayList<String>();
		System.out.println("start");
		for (String string : cc) {
			System.out.println(string);
		}
		System.out.println("end");
	}
}
