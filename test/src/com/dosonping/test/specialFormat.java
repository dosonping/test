package com.dosonping.test;

import java.text.DecimalFormat;

public class specialFormat {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,##0.00"); 
		System.out.println(df1.format(123412341234.56));
	}
}
