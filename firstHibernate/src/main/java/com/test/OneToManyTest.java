package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class OneToManyTest {

	public static void main(String[] args) {


		Configuration con = new Configuration().configure("com/cfgs/hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q = new Question();
		q.setQustion_id(104);
		q.setName("What is java ? ");
		
		Answer ans = new Answer();
		ans.setAnswer_id(204);
		ans.setNameAns("Java is a most popular programming language.");
		ans.setQuestion(q);
		
		Answer ans2 = new Answer();
		ans2.setAnswer_id(304);
		ans2.setNameAns("Java used to defferent software created.");
		
		ans2.setQuestion(q);
		
		List<Answer> list = new ArrayList<Answer>();
		
		list.add(ans);
		list.add(ans2);
		
		q.setAnswer(list);
		
		session.save(q);
		session.save(ans);
		session.save(ans2);
		
		tx.commit();
		
		session.close();
		factory.close();

	}

}
