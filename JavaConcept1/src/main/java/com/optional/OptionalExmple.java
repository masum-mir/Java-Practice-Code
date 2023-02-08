package com.optional;

import java.util.Optional;

public class OptionalExmple { 
	
	public static void main(String[] args) {
		
		
		String str = "this";

		Optional<String> optional = Optional.ofNullable(str);
		
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		System.out.println(optional.orElseThrow());
		
	}
	
}
