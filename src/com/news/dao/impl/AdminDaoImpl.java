package com.news.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.news.dao.AdminDao;
import com.news.entity.Admin;

public class AdminDaoImpl implements AdminDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List search(Admin condition) {
		// TODO Auto-generated method stub
		List list=null;
		Session session=this.sessionFactory.getCurrentSession();
//		Criteria c=session.createCriteria(Admin.class);
//		Example example=Example.create(condition);
//		c.add(example);
//		list=c.list();
		String hql="from Admin where loginName=? and loginPwd=?";
		Query query=session.createQuery(hql);
		query.setString(0, condition.getLoginName());
		query.setString(1, condition.getLoginPwd());
		list=query.list();
		return list;
		//return c.list();
		
	}

}
