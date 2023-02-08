package com.polymorphism;

class Sports {
	String getName() {
		return "Generic sports";
	}
	
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	String getName() {
		return "Soccer Class";
	}
	
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}


public class MethodOverriddenExampleTwo {
	
	public static void main(String ...str) {
		Soccer oc = new Soccer();
		Sports oc1 = new Sports();
		System.out.println(oc.getName());
		oc.getNumberOfTeamMembers();
		
		System.out.println(oc1.getName());
		oc1.getNumberOfTeamMembers();
		
		
	}

}
