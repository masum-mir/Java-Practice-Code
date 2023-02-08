package com.generic;

class Test<T, U, Z>{
	T obj;
	U obj2;
	Z obj3;
	
	Test(T obj, U obj2, Z obj3) {
		this.obj = obj;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	public void getObj() {
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}

public class Main {
	
	public static void main(String [] agrs) {
		Test<String, Integer, String> obj = new Test<String, Integer, String>("Masum", 50, "ABC");
		
		obj.getObj();
		
//		System.out.println(obj.getObj());
		
//		Test<Integer> obj1  = new Test<Integer>(12);
		
//		System.out.println(obj1.getObj());
	}

}
