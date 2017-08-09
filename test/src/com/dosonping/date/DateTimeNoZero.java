package com.dosonping.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeNoZero {
	public static final String FORMAT_DATE = "yyyy-M-d";
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
		Calendar c = Calendar.getInstance();
		c.set(2016, 1, 2);
		Date date = c.getTime();
		String dateString = sdf.format(date);
		System.out.println(dateString);
		c.set(2016, 11, 14);
		String dateString2 = sdf.format(c.getTime());
		System.out.println(dateString2);
	}
}
