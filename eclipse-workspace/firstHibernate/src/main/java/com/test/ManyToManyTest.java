package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Emp;
import com.map.Office;

public class ManyToManyTest {
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("com/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(101);
		e1.setName("abced");
		
		e2.setEid(102);
		e2.setName("efgh");
		
		Office o1 = new Office();
		Office o2 = new Office();
		
		o1.setOid(201);
		o1.setPname("Hello how are you?");
		
		o2.setOid(202);
		o2.setPname("I am fine and you?");
		
		List<Emp> list1 = new ArrayList<Emp>();
		
		List<Office> list2 = new ArrayList<Office>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(o1);
		list2.add(o2);
		
		e1.setOffices(list2);
		
		o2.setEmps(list1);
		
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(o1);
		session.save(o2);
		
		tx.commit();
		factory.close();
		session.close();
		
		
		
		
	}

}
