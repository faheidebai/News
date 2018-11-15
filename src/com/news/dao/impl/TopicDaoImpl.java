package com.news.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.news.dao.TopicDao;
import com.news.entity.Topic;

public class TopicDaoImpl implements TopicDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List getAllTopics() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Criteria c=session.createCriteria(Topic.class);
		return c.list();
	}

	@Override
	public void deleteTopic(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		Topic topic=(Topic)session.get(Topic.class, id);
		session.delete(topic);
	}

	@Override
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		session.save(topic);
	}

	@Override
	public Topic getTopicById(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		Topic topic=(Topic)session.get(Topic.class, id);
		return topic;
	}

	@Override
	public void updateTopic(Topic topic) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		session.update(topic);
	}

}
