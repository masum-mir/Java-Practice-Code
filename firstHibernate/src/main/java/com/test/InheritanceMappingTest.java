package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.MetadataSource;

import com.entity.StudentOne;
import com.entity.StudentThree;
import com.entity.StudentTwo;

public class InheritanceMappingTest {
	
	public static void main(String[] args) {
		
		Configuration con = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		
//		con = new Configuration().configure("com/cfgs/hibernate.cfg.xml");
//		
//		factory = con.buildSessionFactory();
//		session = factory.openSession();
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/cfgs/hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();		
		
		factory = meta.getSessionFactoryBuilder().build();
		session = factory.openSession();
				
		StudentOne s1 = new StudentOne();
//		s1.setId(1);
		s1.setName("cde");
		s1.setRoll(12);
		StudentTwo s2 = new StudentTwo();
		s2.setDept("CMT");
		StudentThree s3 = new StudentThree();
		s3.setResult(150.4);
		
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		
		tx = session.beginTransaction();
		tx.commit();
		
		session.close();
		factory.close();
		
		
		
	}

}
