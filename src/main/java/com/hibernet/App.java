package com.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
      //  Student st= new Student(1,"Shubh","Pune",28);
        Student st1=new Student(2,"Tushar","Nashik",29);
        Student st2=new Student(3,"Rutu","Latur",23);
        Student st3=new Student(4,"Nilesh","Shimla",25);
        
        session.save(st1);
        session.save(st2);
        session.save(st3);
        
        
        Transaction tx=session.beginTransaction();
        tx.commit();
        
        System.out.println("Process Done......");
    }
}
