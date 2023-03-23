package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test1 {
	
	public static void main(String[] agrs) throws IOException {
		
		
		Path path = Path.of("C:\\Users\\pride\\Downloads\\Documents\\hello.txt");
		
		System.out.println(path);
		
		File file = path.toFile();
		
		String workingDir =  System.getProperty("user.dir");
		
		System.out.println(workingDir);
		
		String newFile = workingDir + File.separator + "student.txt";
		
		System.out.println(newFile);
		
		File file1 = new File(newFile);
		
		System.out.println(file1);
		
		Path path1 = Path.of(newFile);
		
		System.out.println("Path 1 :: " + path1);
		
		boolean exists = Files.exists(path);
		
		System.out.println(exists);
		
		
		
//		System.out.println(file);
		
		
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Start typing: ");
//		String line;
//		
//		do {
//			line = reader.readLine();
//			System.out.println(">> "+ line.toUpperCase());
//		} while(!"quite".equals(line));
		
		
		
		
	}

}
