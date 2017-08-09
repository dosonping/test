package com.dosonping.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NewPaths {
	public static void main(String[] args) {
		Path absolutePath = Paths.get("").toAbsolutePath();
		System.out.println(absolutePath.getFileName());
			}
	
}
