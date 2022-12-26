package com.program;

import java.util.ArrayList;
import java.util.Scanner;

class Student25{}
class Teacher{};

public class InstanceOfKeyword {
	
	public static String count(ArrayList list) {
		
		int a=0,b=0;
		
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			
			if(obj instanceof Student25) {
				a++;
			} else if(obj instanceof Teacher) {
				b++;
			}
		}
		String data = Integer.toString(a) + " : " + Integer.toString(b);

		return data;
	}
	

	public static void main(String[] agrs) {
		
		ArrayList list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		int n = 3;
		
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			
			if(s.equals("Student")) {
				list.add(new Student25());
			} else if(s.equals("Teacher")) {
				list.add(new Teacher());
			} else {
				System.out.println("Error");
			}
		}
		
		System.out.println(count(list));
		
		
	}

}
