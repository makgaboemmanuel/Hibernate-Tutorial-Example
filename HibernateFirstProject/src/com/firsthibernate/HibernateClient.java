package com.firsthibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*************  user added code  ****************/
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); /*  com.firsthibernate/ */
		
		SessionFactory factory = cfg.buildSessionFactory() ;
		Session session =  factory.getCurrentSession();
		session.beginTransaction() ;
		/*  Select Operation with Employee  */
		List<Contacts> contactList =  session.createCriteria(Contacts.class).list() ;
		
		for (Contacts contacts : contactList) {
			System.out.println(contacts); 
		}
		
		
	}

}
