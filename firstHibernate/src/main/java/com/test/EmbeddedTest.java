package com.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Details;
import com.entity.Teacher;

public class EmbeddedTest {
	
	public static void main(String [] args) {
		
		Configuration con = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null ;
		
		con = new Configuration();
		con.configure("com/cfgs/hibernate.cfg.xml");
		factory = con.buildSessionFactory();
		session = factory.openSession();
		
		Teacher t = new Teacher();
//		t.setId(03);
		t.setName("ijkl");
		t.setCity("Dhaka");
		Details d = new Details();
		d.setCollage_name("KIPI");
		d.setPhone_no(323);
		t.setDetail(d);
		
		session.save(t);
		
		tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
		factory.close();
		
		
	}

}
