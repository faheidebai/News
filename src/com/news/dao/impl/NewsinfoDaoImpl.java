package com.news.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.news.dao.NewsinfoDao;
import com.news.entity.Comment;
import com.news.entity.Newsinfo;

public class NewsinfoDaoImpl implements NewsinfoDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	public Integer getCountOfAllNewsinfo() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Criteria c=session.createCriteria(Newsinfo.class);
		return c.list().size();
	}

	@Override
	public List getAllNewsinfoByPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Criteria c=session.createCriteria(Newsinfo.class);
		c.setFirstResult((page-1)*pageSize);
		c.setMaxResults(pageSize);
		c.addOrder(Order.desc("createdate"));
		return c.list();
	}

	@Override
	public Integer getCountOfNewsinfo(Newsinfo condition) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Criteria c=session.createCriteria(Newsinfo.class);
		if(condition!=null){
			if(condition.getTopic()!=null
					&&condition.getTopic().getId()!=null){
				c.add(Restrictions.eq("topic.id",//相等,精确查询
						condition.getTopic().getId()));
			}
			if(condition.getTitle()!=null
					&&!"".equals(condition.getTitle())){//标题模糊查询
				c.add(Restrictions.like("title", 
						condition.getTitle(),MatchMode.ANYWHERE));
			}
		}
		return c.list().size();
	}

	@Override
	public List getNewsinfoByConditionAndPage(Newsinfo condition, int page, int pageSize) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Criteria c=session.createCriteria(Newsinfo.class);
		if(condition!=null){
			if(condition.getTopic()!=null
					&&condition.getTopic().getId()!=null){
				c.add(Restrictions.eq("topic.id",//相等,精确查询
						condition.getTopic().getId()));
			}
			if(condition.getTitle()!=null
					&&!"".equals(condition.getTitle())){//标题模糊查询
				c.add(Restrictions.like("title", 
						condition.getTitle(),MatchMode.ANYWHERE));
			}
		}
		c.setFirstResult((page-1)*pageSize);
		c.setMaxResults(pageSize);
		c.addOrder(Order.desc("createdate"));
		return c.list();
	}


	@Override
	public Newsinfo getNewsinfoById(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		Newsinfo newsinfo=(Newsinfo)session.get(Newsinfo.class, id);
		return newsinfo;
	}


	@Override
	public void deleteNews(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		Newsinfo newsinfo=(Newsinfo)session.get(Newsinfo.class, id);
		session.delete(newsinfo);
		
	}


	@Override
	public void addNews(Newsinfo newsinfo) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		session.save(newsinfo);
	}


	@Override
	public void updateNews(Newsinfo newsinfo) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		session.update(newsinfo);
		
	}


	@Override
	public Comment getNewsCommentsById(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		Comment comment=(Comment)session.get(Newsinfo.class, id);
		return comment;
	}

}
