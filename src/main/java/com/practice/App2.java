package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernet.Student;

public class App2 {
	public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        //fetch all objects from the Employee table
        
        Transaction tx=session.beginTransaction();
        
        Employee e= session.load(Employee.class, 3);
        e.setEmpName("SSM");
        e.setAge(2);
        e.setDpt("mech");
        session.update(e);
       // System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getAge()+" "+e.getDpt());
        tx.commit();
        session.close();
        factory.close();
       
        
	     
        System.out.println("Process Done......");
    }
}
