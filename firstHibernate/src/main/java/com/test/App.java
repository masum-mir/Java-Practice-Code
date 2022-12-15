package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.transaction.UserTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Product;
import com.entity.Teacher;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Product p = new Product();
    	
    	Teacher st = new Teacher();
    	
    	Address ad = new Address();
    	
    	ad.setStreet("street 1");
    	ad.setCity("Gazipur");
    	ad.setOpen(true);
    	ad.setX(213123.23);
    	ad.setAddedDate(new Date());
    	
    	//image upload
		/*FileInputStream file = new FileInputStream("src/main/java/img1.jpg");
		byte[] data=new byte[file.available()];
		file.read(data);
		ad.setImage(data);*/
    	
    	File file = new File("C:\\Users\\masum\\Desktop\\pdf guide\\angular.pdf");
    	byte[] data = new byte[(int) file.length()];
    	
    	FileInputStream fis = new FileInputStream(file);
    	fis.read(data);
    	fis.close();
    	ad.setImage(data);
    	
//    	st.setId(102);
    	st.setName("A");
    	st.setCity("B");
    	
    	System.out.println(st);
    	 
//    	p.setPid(22);
    	p.setPname("table");
//    	p.setPrice(1400f);
//    	p.setQty(1.0f);
    	
    	SessionFactory factory = null;
    	Configuration cfg = null;
    	Session session = null;
    	Transaction tx = null;
    	
    	boolean flag = false;
    	
 
    	cfg = new Configuration();
    	
    	System.out.println("cfg one  =   " +cfg.getProperties());
    	System.out.println("------------------------------------------------------------------------------");
    	
    	cfg.configure("com/cfgs/hibernate.cfg.xml");
    	
    	System.out.println("cfg two  =   " +cfg.getProperties());
    	
    	factory = cfg.buildSessionFactory();
    	
    	System.out.println("factory == " +factory.getClass().getName());
    	
		/* session = factory.openSession();
		
		System.out.println("session == " +session);
		System.out.println("session == " +session.getClass());
		
		System.out.println(p);
		
		try {
		
		tx = session.beginTransaction();
		System.out.println("tx  == " + tx);
		System.out.println("After tansaction");
		
		
		//    	session.save(p);
		int valueId = (Integer) session.save(p);
		System.out.println("valueId =="+ valueId);
		
		System.out.println("Before tansaction");
		
		flag = true;
		
		//    	tx.commit();
		System.out.println("tx  commit  == " + tx);
		
		//    	tx.rollback();
		
		System.out.println("tx rollback  == " + tx);
		
		
			
		 } catch(Exception e) {
			 flag = false;
			 e.printStackTrace();
		 } finally {
			 
			 if(flag = true) {
				 tx.commit();
				 System.out.println("commit == " +tx);
			 } else {
				 tx.rollback();
				 System.out.println("rollback == " +tx);
			 }
		
		     session.close();
		     System.out.println("session == " +session);
		     factory.close();
		     System.out.println("factory == " +factory);
		 }
		*/
    	

    	
    	session = factory.openSession();
    	
    	session.save(st);
    	session.save(ad);
    	
    	Transaction tr = session.beginTransaction();
    	
    	tr.commit();
    	
    	session.close();
    	
    	
    	
    	
    }
}
