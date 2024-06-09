package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuesAnsMain {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration(); 
		 cfg.configure("Hibernate.cfg.xml");
	     SessionFactory factory = cfg.buildSessionFactory();
	     
	     Session session=factory.openSession();
	     Transaction tx=session.beginTransaction();
	     
	     Question1 q1= new Question1();
	     q1.setQid(1);
	     q1.setQuestions("what is java");
	     
	     Answer1 a1= new Answer1();
	     a1.setAid(1221);
	     a1.setAnswers("java is a programming language");
	     
	     Answer1 a2= new Answer1();
	     a2.setAid(789);
	     a2.setAnswers("java is a programming independent language");
	     
	     Answer1 a3= new Answer1();
	     a3.setAid(456);
	     a3.setAnswers("java is a sequre and robust programming language");
	     
	     List<Answer1>List = new ArrayList<>();
	     
	     List.add(a1);
	     List.add(a2);
	     List.add(a3);
	     
	     q1.setAns(List);
	     
	     a1.setQues(q1);
	     a2.setQues(q1);
	     a3.setQues(q1);
	     
	     session.save(q1);
	     session.save(a1);
	     session.save(a3);
	     session.save(a2);
	     
	     tx.commit();
	     
	     session.close();
	     factory.close();
	     
	     
}
}

