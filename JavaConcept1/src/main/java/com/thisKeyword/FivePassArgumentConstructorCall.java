package com.thisKeyword;

class Student2 {
	Student3 ref;
	
	Student2(Student3 ref) {
		this.ref = ref;
	}
	void display() {
		System.out.println(ref.data);
	}
}

class Student3 {
	int data = 10;
	Student3() {
		Student2 st = new Student2(new Student3());
		st.display();
	}
}

public class FivePassArgumentConstructorCall {
	
	public static void main(String[] agrs) {
		
		Student3 s1 = new Student3();
		
		
	}

}
