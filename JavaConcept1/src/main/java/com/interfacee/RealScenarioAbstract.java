package com.interfacee;

interface A {
	void a();
	void b();
	void c();
}

abstract class B implements A {
	public void b() {
		System.out.println("hello, world");
	}
}

class C extends B{

	@Override
	public void a() {
		System.out.println("aaa");
	}

	@Override
	public void c() {
		System.out.println("ccc");
	}
}

public class RealScenarioAbstract {

	public static void main(String[] args) {

		C c = new C();
		c.a();
		c.b();
		c.c();

	}

}
