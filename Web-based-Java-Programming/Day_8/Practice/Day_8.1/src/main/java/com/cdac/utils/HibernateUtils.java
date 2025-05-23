package com.cdac.utils;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtils {
	private static SessionFactory factory;
	static {
		System.out.println("in static init block");
		/*
		 * Create SF 1. Create Configuration class instance using def ctor 2. Public
		 * Configuration congigure() throws HibernateException 3. Build SF (Session
		 * Factory public SessionFactory buidSessionFactory()
		 */
		factory = new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return factory;
	}
}
