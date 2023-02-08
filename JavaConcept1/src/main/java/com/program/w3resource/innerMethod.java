package com.program.w3resource;

public class innerMethod {
	
	void display2 () {
		class inner2 {
			void p() {
				System.out.println("hfdgddfgello");
			}
		}
		inner2 obj = new inner2();
		obj.p();
	}
	
	interface myInterface {
		void num();
		void vlaue();
	}
	
	void print() {
		myInterface m = new myInterface() {

			@Override
			public void num() {
				System.out.println("num");
			}

			@Override
			public void vlaue() {
				System.out.println("value");
			}

		};
		m.num();
		m.vlaue();
	}
	
	void display() {
		System.out.println("Hello inner");
		
		class inner {
			void show() {
				System.out.println("hi");
			}
		}
		new inner().show();
	}
	
	
	
	public static void main(String[] agrs) {
		
//		int [] nums = {1,1,2,3,4,5,5,5,6,7};
//		
//		int a[] = new int[nums.length];
//		
//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				
//				if(nums[i]==nums[j]) {
//					continue;
//				}
//				
//			}
//		}
//		
		
		
		innerMethod rd = new innerMethod();
		
//		rd.display();
//		rd.print();
		
		rd.display2();
	}

}
