package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;

public class CriteriaMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		 Criteria c=session.createCriteria(Item.class);
		c.add(Restrictions.gt("qunt", 20));
		List<Item> l = c.list();
		for (Item i : l) {
			System.out.println(i.getItemId() + " " + i.getItemName() + " " + i.getPrice() + " " + i.getQunt() + " "
					+ i.getCategory());
		}
		
		
	//	c.add(Restrictions.between("qunt", 40, 45));
//		
//		List<Item> l1 = c.list();
//		for (Item i : l1) {
//			System.out.println(i.getItemId() + " " + i.getItemName() + " " + i.getPrice() + " " + i.getQunt() + " "
//					+ i.getCategory());
//		}
//		
//		c.add(Restrictions.gt("qunt", 50));
//		List<Item> l2 = c.list();
//		for (Item i : l2) {
//			System.out.println(i.getItemId() + " " + i.getItemName() + " " + i.getPrice() + " " + i.getQunt() + " "
//					+ i.getCategory());
//		}
//		
//		c.add(Restrictions.like("itemName","mouse"));
//		List<Item> l3 = c.list();
//		for (Item i : l3) {
//			System.out.println(i.getItemId() + " " + i.getItemName() + " " + i.getPrice() + " " + i.getQunt() + " "
//					+ i.getCategory());
//		}
//		
//		c.add(Restrictions.eq("itemName", l));
//		List<Item> l4 = c.list();
//		for (Item i : l4) {
//			System.out.println(i.getItemId() + " " + i.getItemName() + " " + i.getPrice() + " " + i.getQunt() + " "
//					+ i.getCategory());
//		}
//		
//		c.add(Restrictions.like("itemName", "T%"));
//		List<Item> l5 = c.list();
//		for (Item i : l5) {
//			System.out.println(i.getItemId() + " " + i.getItemName() + " " + i.getPrice() + " " + i.getQunt() + " "
//					+ i.getCategory());
//		}
		//PAGINATION
//		c.setFirstResult(1);
//		c.setMaxResults(5);
//		
//		List<Item> l6 = c.list();
//		for (Item i : l6) {
//			System.out.println(i.getItemId() + " " + i.getItemName() + " " + i.getPrice() + " " + i.getQunt() + " "
//					+ i.getCategory());
//		}
//
//		tx.commit();
//		session.close();
//		factory.close();
		
		
		

	}
}
