package com.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.query.Query;

public class HqlMain {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration(); 
		 cfg.configure("Hibernate.cfg.xml");
	     SessionFactory factory = cfg.buildSessionFactory();
	     
	     Session session=factory.openSession();
	     Transaction tx=session.beginTransaction();
	     
	     //select multiple columns using projections 
	     Criteria c= session.createCriteria(Bank.class);
	     PropertyProjection p= Projections.property("bankName");
	     PropertyProjection p1= Projections.property("bal");
	     PropertyProjection p2= Projections.property("acctNo");
	     
	     ProjectionList pList = Projections.projectionList();
	     

	     pList.add(p);
	     pList.add(p1);
	     pList.add(p2);
	     
	     c.setProjection(pList);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    // String query = "from Bank where  bankName=:x";
	    // String query ="delete from Bank where BankName=:p";
//	     String query ="update from Bank set custName=:x where BankName=:y";
//	     Query q= session.createQuery(query);
//	    q.setParameter("x", "Shubham");
//	    q.setParameter("y", "HDFC");
//	    int count= q.executeUpdate();
//	    System.out.println(count +"records are deleted");
//	    
//	     List<Bank> b=q.list();
//	     
//	     for(Bank obj :b) {
//	    	 System.out.println(obj.getBankName()+" "+obj.getAcct_type()+" "+obj.getBal()+" "+obj.getCust_id()+" "+obj.getCustName());
//	     }
//	     Bank b1 = new Bank("Aarti",12111,"saving","BOI");
//	     session.save(b1);
//	     Bank b2 = new Bank("Vishnu",12563,"saving","HDFC");
//	     session.save(b2);
//	     Bank b3 = new Bank("Shubham",15136,"Current","SBI");
//	     session.save(b3);
//	     Bank b4 = new Bank("Punam",78536,"saving","Dena");
//	     session.save(b4);
	     
	 //    tx.commit();
	     
	  //   session.close();
	    // factory.close();
	     
	   //Projection
//	     Criteria c= session.createCriteria(Bank.class);
//			PropertyProjection p = Projections.property("bankName");
//			c.setProjection(p);
//			List<Bank> List = c.list();
//			
//			Iterator it = List.iterator();
//			
//			while(it.hasNext())
//			{
//				String name = (String)it.next();
//				System.out.println(name);
//			}
	}
	
     
    
     
     
    
     
    		 
}
