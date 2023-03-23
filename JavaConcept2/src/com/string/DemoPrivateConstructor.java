package com.string;

class TestDemo {
	
	private static TestDemo testDemo;
	
	private TestDemo() {
		System.out.println("hello world");
	}
	
	private TestDemo(int num) {
		System.out.println("Number is :: "+num);
	}
	
	public static TestDemo getInstance(int num) {
		
		if(testDemo == null) {
//			testDemo = new TestDemo();
			testDemo = new TestDemo(num);
		}
		
		return testDemo;
	}
	
}

public class DemoPrivateConstructor {
	
	public static void main(String[]args) {
		
		TestDemo t = TestDemo.getInstance(290);
		
//		System.out.println(t.hashCode());
		
		
		
	}

}
