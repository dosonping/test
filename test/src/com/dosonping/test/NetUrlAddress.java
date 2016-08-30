package com.dosonping.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetUrlAddress {
	public static void main(String[] args) {
		String host = "www.easyworld.cn";
		try {
			InetAddress inetAddress = InetAddress.getByName(host);
			String hostAddress = inetAddress.getHostAddress();
			System.out.println(hostAddress);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
