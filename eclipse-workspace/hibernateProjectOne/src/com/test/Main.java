package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class Main {

	public static void main(String[] args) {

		//configuration
		
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;

			cfg = new Configuration();
			cfg.configure("com/cfgs/hibernate.cfg.xml");
			factory = cfg.buildSessionFactory();
			session = factory.openSession();
			
			//entity
			
			Product product = new Product();
			product.setPid(1);
			product.setPname("abc");
			product.setPrice(2123.43f);
			product.setQty(3.0f);
			
			//saving the object

			
			tx= session.beginTransaction();
			
			session.save(product);
			
			//all non select operation should be committed
			tx.commit();
			
			System.out.println(factory);
			System.out.println("Object is saved");

			session.close();
			factory.close();

			
			

		
		
		
		

	}

}
