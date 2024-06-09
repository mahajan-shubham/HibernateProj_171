package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuesAns {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration(); 
		 cfg.configure("Hibernate.cfg.xml");
	     SessionFactory factory = cfg.buildSessionFactory();
	     
	     Session session=factory.openSession();
	     Transaction tx=session.beginTransaction();
	     
	     Questions q1= new Questions();
	     q1.setQid(1);
	     q1.setQuestions("What is hibernate");
	     
	     Questions q2= new Questions();
	     q2.setQid(2);
	     q2.setQuestions("What is Java");
	     
	     
	     Answer a1 = new Answer();
	     a1.setAid(2312);
	     a1.setAnswers("Java is programing language");
	     
	     Answer a2 = new Answer();
	     a2.setAid(1212);
	     a2.setAnswers("Hibernate is a ORM tool");
	     
	     q1.setAns(a2);
	     q2.setAns(a1);
	     a2.setQues(q1);
	     a1.setQues(q2);
	     
	     
	     session.save(a1);
	     session.save(a2);
	     session.save(q1);
	     session.save(q2);
	     
	     tx.commit();
	     session.close();
	     factory.close();
	     
	     
	}
}
