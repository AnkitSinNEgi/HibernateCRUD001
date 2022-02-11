package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionID(101);
		q1.setQuestion("Java");
		
		Answer answer = new Answer();
		answer.setAnswerID(1001);
		answer.setAnswer("Programming");
		q1.setAnswer(answer);
		

		Question q2 = new Question();
		q2.setQuestionID(102);
		q2.setQuestion("JavaScript");
		
		Answer answer1 =new Answer();
		answer1.setAnswerID(2001);
		answer1.setAnswer("Scripting");
		q2.setAnswer(answer1);
		
		
	
		Session s = factory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(q2);
		tx.commit();
		factory.close();
	}

}
