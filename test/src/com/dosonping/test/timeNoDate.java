package com.dosonping.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeNoDate {
	public static void main(String[] args) {
		timeNoDate t = new timeNoDate();
		t.getTime();
	}
	public void getTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = sdf.parse("10:20:23");
			System.out.println("date: " + date);
			String dateStr = sdf.format(date);
			System.out.println("dateStr: " + date);
			System.out.println(new Date());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
