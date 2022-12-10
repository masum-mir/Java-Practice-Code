package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Teacher;

public class FeatchDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("com/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
    	
    	Address address = (Address)  session.load(Address.class, 6);
//    	System.out.println("address:: " +address);
//    	System.out.println(address.getCity() + " : "+ address.getStreet());
    	
    	Address address2 = (Address)  session.load(Address.class, 6);
//    	System.out.println(address2);
//    	System.out.println(address2.getCity() + " : "+ address2.getStreet());
    	
    	session.close();
    	factory.close();
	}

}
