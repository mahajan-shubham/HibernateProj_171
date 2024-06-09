package com.hibernet;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory = cfg.buildSessionFactory();
	     
	     Session session=factory.openSession();
	     
	    // Person p0= new Person("Shubhangi",28, new Date(),466256);
	     Person p1=new Person("Shubh",22,new Date(),45678);
	     Person p2=new Person("Rutu",23,new Date(),7899455);
	     Person p3=new Person("Nilesh",25,new Date(),45623);
	     
	     session.save(p1);
	     session.save(p2);
	     session.save(p3);
	     
	     
	     Transaction tx=session.beginTransaction();
	     tx.commit();
	     
	     session.close();
	     factory.close();
	     
	     System.out.println("Process Done......");
	}
	
}
