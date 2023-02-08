package com.inheritance;

class Address {
	String city, state, country;
	
	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Emp {
	int id;
	String name;
	Address address;
	
	Emp (int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id + " : " + name);
		System.out.println(id + " : " + name + " : "+address.country);
		System.out.println(address.city + " : " + address.country + " : "+address.state);
	}
}

public class Has_ATest2 {

	public static void main(String[] args) {
		
		Address a1 = new Address("Sreepur", "Gazipur", "Dhaka");

		Emp e1 = new Emp(12,"masum", a1);
		
		e1.display();

	}

}
