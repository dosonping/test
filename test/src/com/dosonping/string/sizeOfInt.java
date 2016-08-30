package com.dosonping.string;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class sizeOfInt {
	public static void main(String[] args) {
		//System.out.println(0/3);
		Integer i = 1;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(3);
		nf.setMinimumIntegerDigits(3);
		nf.setGroupingUsed(false);
		String format = nf.format(i);
		System.out.println(format);
		
		
		DecimalFormat df = new DecimalFormat("000");
		String format2 = df.format(i);
		
		System.out.println(format2);
	}
}
