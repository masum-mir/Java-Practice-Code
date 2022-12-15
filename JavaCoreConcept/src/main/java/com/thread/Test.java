package com.thread;

public class Test extends Thread{
	
	public void run() {
		
		System.out.println("Thread is running.");
		
	}
	
	public void display() {
		System.out.println("Now you are show  data.>!");
	}
	

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{

		Test t = new Test();
		Thread thread = new Thread(t);
	
		
		thread.start();
//		Thread.yield();
//		t.stop();
//		t.suspend();
//		t.resume();
//		t.sleep(5000);	
		
		t.join(5000);
		t.display();
		
		System.out.println("Hi");
		
//		for(int i=1;i<=10;i++) {
//			System.out.print(i + " ");
//			try {
//				Thread.sleep(1000);
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
		
//		int amount = 0;
//		while(thread.isAlive()) {
//			System.out.println("Waiting");
//		}
//		
//		System.out.println(amount);
//		
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	}

}
