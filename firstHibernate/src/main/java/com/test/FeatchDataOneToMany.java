package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class FeatchDataOneToMany {

	public static void main(String[] args) {

		Configuration con = new Configuration();
		con.configure("com/cfgs/hibernate.cfg.xml");

		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		
		Question question = (Question) session.load(Question.class, 103);
		
		System.out.println(question.getName());
//		
//		Answer answer = session.get(Answer.class, 203);
//		System.out.println(answer.getNameAns());
		
		for(Answer a: question.getAnswer()) {
			System.out.println(a.getNameAns());
		}
		
		session.close();
		factory.close();
		
		
	}

}
