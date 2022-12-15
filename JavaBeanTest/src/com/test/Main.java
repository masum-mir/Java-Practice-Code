package com.test;

import com.beans.UserBean;

public class Main {
	
	public static void main(String [] args) {
		UserBean ub = new UserBean();
		
		ub.setName("Masum");
		ub.setDept("CMT");
		
		String nm = ub.getName();
		String dpt = ub.getDept();
		
		System.out.println(nm + " " + dpt);
		
		System.out.println(ub);
		
	}

}
