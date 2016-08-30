package com.dosonping.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetNetFile {
	public static void main(String[] args) {
		GetNetFile getNetFile = new GetNetFile();
		getNetFile.downFile();
		
	}
	String url;
	public URL getUrl(String url){
		try {
			URL u = new URL("http", url, "/index.htm");
			return u;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void downFile(){
		URL url2 = getUrl("www.worldeasy.cn");
		try {
			URLConnection urlConnection = url2.openConnection();
			urlConnection.connect();
			InputStream inputStream = urlConnection.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(inputStream);
			//OutputStream outputStream = urlConnection.getOutputStream();
			//BufferedOutputStream bos = new BufferedOutputStream(outputStream);
			byte[] b = new byte[1024];
			int hasMore =0;
			while((hasMore=bis.read(b, 0, 1024))!=-1){
				System.out.println(new String(b));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
