package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.OneToOneM;
import com.map.OneToOneMap;

public class OneToOneTest {
	
	public static void main(String[] args) {
		
		Configuration con = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null ;
		
		con = new Configuration();
		con.configure("com/cfgs/hibernate.cfg.xml");
		factory = con.buildSessionFactory();
		session = factory.openSession();
		
		tx = session.beginTransaction();
		
		OneToOneM to = new OneToOneM();
		to.setId(2842);
		to.setName("name");
		to.setDept("CMT");
		
		OneToOneMap tom = new OneToOneMap();
		tom.setA_id(2494);
		tom.setClg("Kipi");
		tom.setRoll(234);
		
		to.setOneToMap(tom);
		tom.setOneTo(to);
		
		session.save(to);
		session.save(tom);
		
		
		
		tx.commit();
		
		session.close();
		factory.close();
		
	}

}
