package com.cdac.dao;

import com.cdac.entities.User;
import org.hibernate.*;
import static com.cdac.utils.HibernateUtils.getFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

	@Override
	public String signUp(User user) {
		String mesg="Sign up failed!!!!!!!!";
		// 1. Get Hibernate Session from SessionFactory
				/*
				 * API of org.hibernate.SessionFactory 
				 * public Session getCurrentSession() throws HibExc
				 * - Hibernate's SF chks if there is already existing Session
				 * - no , creates the Session obj n rets it.
				 * - yes - rets existing session to the caller.
				 */
		
		Session session = getFactory().getCurrentSession();
		Session session2 = getFactory().getCurrentSession();
		System.out.println(session==session2);		//true
		
		/*
		 * 2. Begin a Transaction
		 * Session API
		 * public Transaction beginTransaction() throws HibExc
		 */
		
		Transaction tx=session.beginTransaction();
		System.out.println(session.isOpen()+" "+session.isConnected());//t t
		try {
			/*
			 * Session API
			 * public void persist(Object transientObj)  throws HibExc
			 */
			session.persist(user);
			//=> success
			tx.commit();
			mesg="User signed up !"+user.getUserId();
		} catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			//re-throw the exception to caller - so that caller knows about it !
			throw e;
		}
		return mesg;
	}

	@Override
	public User getUserDetails(Long userId) {
		User user = null;
		// 1. Get Session from SessionFactory
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.get(User.class, userId);// select
			/*
			 * Hibernate checks if entity already exists in L1 cache with given id ? - if
			 * not - select query -> RST processing -> rets null | persistent entity
			 */
//			user=session.get(User.class, userId);
//			user=session.get(User.class, userId);
//			user=session.get(User.class, userId);//reading from cache 
			/*
			 * in case of valid id - user - PERSISTENT(exists in L1 cache n DB)
			 */
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw exc to the caller
			throw e;
		}
		return user;// user - Detached from L1 cache
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		String jpql = "select u from User u";
		// 1. Get Session from SessionFactory
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class).getResultList();// select
			// users - list of persistent entities
			tx.commit();// flush - DML - no , close
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw exc to the caller
			throw e;
		}

		return users;// users - list of DETACHED entities
	}

}
