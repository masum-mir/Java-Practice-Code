package com.array;

public class SaaTest {

	public static String getStringValue(int index, String text) {
		String segments[] = text.split("/");
		String value = "";
		for (int i = segments.length - index; i < segments.length; i++) {
			value = value + "/" + segments[i];
		}
		System.out.println(value);
		return value;
	}

	public static void main(String[] args) {

		SaaTest.getStringValue(2,"F:/workplace/server/apache-tomcat-8.5.76/webapps/ROOT/USER_FILES/68e3ada1-b9d8-4319-bd4e-1e3a34cd26df.jpg");
	}
}
