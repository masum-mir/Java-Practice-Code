package com.constructor;

class Language {
	private static Language language;
	
	private Language () {
		System.out.println("Hello worlds");
	}
	
	private Language(int num) {
		System.out.println("Number is: :"+num);
	}
	
	public static Language getLanguage(int num) {
		
		if(language == null) {
			language = new Language(num);
		}
		
		return language;
	}
}

public class PrivateLanguage {
	
	public static void main(String[] args) {
		Language la;
		
		la = Language.getLanguage(20);
	}
	

}
