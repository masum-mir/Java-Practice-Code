package com.constructor;

class RestrictInstance {
	
	public static int varCount = 0;
	
	private RestrictInstance() {
		varCount++;
		System.out.println("count :: "+ varCount);
	}
	
	public static RestrictInstance getInstance() {
		if(varCount < 5) {
			return new RestrictInstance();
		}
		System.gc();
		return null;
	}
	
	public void finalize() {
		System.out.println("Instance is delete");
		varCount--;
	}
	
}

public class PrivateConstructorRestrictInstanceCreation {
	
	public static void main(String[] agrs) {
		
		RestrictInstance obj;
		
		int a = 1;
		while(a<=20) {
			obj = RestrictInstance.getInstance();
			a++;
		}
		
	}

}
