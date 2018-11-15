package com.news.biz.impl;

import java.util.List;

import com.news.biz.NewsinfoBiz;
import com.news.dao.NewsinfoDao;
import com.news.entity.Comment;
import com.news.entity.Newsinfo;
import com.news.entity.Pager;

public class NewsinfoBizImpl implements NewsinfoBiz {

	private NewsinfoDao newsinfoDao;
	
	public void setNewsinfoDao(NewsinfoDao newsinfoDao) {
		this.newsinfoDao = newsinfoDao;
	}

	@Override
	public List getAllNewsinfoByPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return this.newsinfoDao.getAllNewsinfoByPage(page, pageSize);
	}

	@Override
	public Pager getPagerOfAllNewsinfo(int pageSize) {
		// TODO Auto-generated method stub
		int count=this.newsinfoDao.getCountOfAllNewsinfo();
		Pager pager=new Pager();
		pager.setPerPageRows(pageSize);//每页记录条数
		pager.setRowCount(count);//总记录数
		return pager;
	}

	@Override
	public List getNewsinfoByConditionAndPage(Newsinfo condition, int page, int pageSize) {
		// TODO Auto-generated method stub
		return this.newsinfoDao.getNewsinfoByConditionAndPage(condition, page, pageSize);
	}

	@Override
	public Pager getPagerOfNewsinfo(Newsinfo condition, int pageSize) {
		// TODO Auto-generated method stub
		int count=this.newsinfoDao.getCountOfNewsinfo(condition);
		Pager pager=new Pager();
		pager.setPerPageRows(pageSize);//每页记录条数
		pager.setRowCount(count);//总记录数
		return pager;
	}

	@Override
	public Newsinfo getNewsinfoById(int id) {
		// TODO Auto-generated method stub
		return this.newsinfoDao.getNewsinfoById(id);
	}

	@Override
	public void deleteNews(int id) {
		// TODO Auto-generated method stub
		this.newsinfoDao.deleteNews(id);
	}

	@Override
	public void addNews(Newsinfo newsinfo) {
		// TODO Auto-generated method stub
		this.newsinfoDao.addNews(newsinfo);
	}

	@Override
	public void updateNews(Newsinfo newsinfo) {
		// TODO Auto-generated method stub
		this.newsinfoDao.updateNews(newsinfo);
	}

	@Override
	public Comment getNewsCommentsById(int id){
		// TODO Auto-generated method stub
		return this.newsinfoDao.getNewsCommentsById(id);
	}

}
