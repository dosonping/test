package com.dosonping.system;

import java.util.Map;
import java.util.Properties;

public class SystemOp {
	public static void main(String[] args) {
		Map<String, String> map = System.getenv();
		for(Map.Entry<String, String> entry :map.entrySet()){
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		Properties properties = System.getProperties();
	}
}
