package com.lambda;

@FunctionalInterface
interface demoInt{
	void show1(int a, int b);
//	void show2();
}

//class demoAno implements demoInt{
//
//
//	@Override
//	public void show1(int a, int b) {
//		System.out.println("One mehtod");	
//		
//	}
//}


//class demoAno implements demoInt {
//
//	@Override
//	public void show1() {
//		System.out.println("One mehtod");	
//	}
//
//	@Override
//	public void show2() {
//		System.out.println("One mehtod");	
//	}
//	
//	
//}

public class Test {

	public static void main(String ...ad) {
		
		
		// anonymous class
//		demoInt obj = new demoInt() {
//			
//			@Override
//			public void show2() {
//				System.out.println("I am show two");
//				
//			}
//			
//			@Override
//			public void show1() {
//				System.out.println("HEllo World");
//			}
//		};
//		
//		obj.show1();
//		obj.show2();
		
//		demoInt obj = new demoAno();
//		
//		obj.show1();
	
		
		// lambda expression ..!
		
//		demoAno obj = new demoAno();
//		obj.show1(10, 20);
		
		demoInt obj = (a,b) -> {
			System.out.println("I am methos one: "+(a + b));
		};
		obj.show1(33,7);
		
	}
}



