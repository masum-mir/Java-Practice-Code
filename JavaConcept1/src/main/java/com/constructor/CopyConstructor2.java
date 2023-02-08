package com.constructor;

public class CopyConstructor2 {
	
	int id;
	String name;
	
	CopyConstructor2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	CopyConstructor2(CopyConstructor2 ref) {
		this.id = ref.id;
		this.name = ref.name;
	}
	
	void display() {
		System.out.println(id + " : " + name);
	}

	public static void main(String[] args) {
		
		CopyConstructor2 cc = new CopyConstructor2(121,"Masum");
		CopyConstructor2 cc2 = new CopyConstructor2(cc);
		
		cc.display();
		cc2.display();
		

	}

}
