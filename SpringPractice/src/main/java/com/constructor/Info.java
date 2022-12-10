package com.constructor;

public class Info {
	
	private String address;
	
	public Info(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.address;
	}

}
