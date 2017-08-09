package com.dosonping.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhileTest implements Runnable{
	public static void main(String[] args) {
		WhileTest wt1 = new WhileTest();
		Thread t1 = new Thread(wt1, "t1");
		WhileTest wt2 = new WhileTest();
		Thread t2 = new Thread(wt2, "t2");
		WhileTest wt3 = new WhileTest();
		Thread t3 = new Thread(wt3, "t3");
		WhileTest wt4 = new WhileTest();
		Thread t4 = new Thread(wt4, "t4");
		WhileTest wt5 = new WhileTest();
		Thread t5 = new Thread(wt5, "t5");
		WhileTest wt6 = new WhileTest();
		Thread t6 = new Thread(wt6, "t6");
		WhileTest wt7 = new WhileTest();
		Thread t7 =new Thread(wt7, "t7");
		WhileTest wt8 = new WhileTest();
		Thread t8 = new Thread(wt8, "t8");
		WhileTest wt9 = new WhileTest();
		Thread t9 = new Thread(wt9, "t9");
		WhileTest wt10 = new WhileTest();
		Thread t10 = new Thread(wt10, "t10");
		WhileTest wt11 = new WhileTest();
		Thread t11 = new Thread(wt11, "t11");
		WhileTest wt12 = new WhileTest();
		Thread t12 = new Thread(wt12, "t12");
		WhileTest wt13 = new WhileTest();
		Thread t13 = new Thread(wt13, "t13");
		WhileTest wt14 = new WhileTest();
		Thread t14 = new Thread(wt14, "t14");
		WhileTest wt15 = new WhileTest();
		Thread t15 = new Thread(wt15, "t15");
		WhileTest wt16 = new WhileTest();
		Thread t16 = new Thread(wt16, "t16");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
	}

	@Override
	public void run() {
		while(true) {
			for(int i = 0; i < 10000; i++) {
				for(int j = 0; j < 10000; j++) {
					File f = new File("new.doc");
					File ff = new File("doc.txt");
					File fff = new File("a.xls");
					Map m = new HashMap<String, String>(10000);
					List l = new ArrayList<String>(10000);
					ByteArrayOutputStream bao = new ByteArrayOutputStream(100000);
//					try {
//						FileOutputStream fos = new FileOutputStream(f);
//					} catch (FileNotFoundException e) {
//						e.printStackTrace();
//					}
					
				}
			}
			Calendar c = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat();
			String time = sdf.format(c.getTime());
			System.out.println("time: " + time + "aaaaa");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
