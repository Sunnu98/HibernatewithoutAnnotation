package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
	public static void main(String[] args) {// 2 JARS hibe and MySQL

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		// insert data into database
		Student student = new Student();
		// student.setId(101);
		student.setName("ram");
		student.setCity("Pune");
		student.setNumber("123456");
		session.save(student);
		tr.commit();
		session.close();
		System.out.println("Record inserted successfully.");
	}
}
