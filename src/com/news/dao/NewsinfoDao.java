package com.news.dao;

import java.util.List;

import com.news.entity.Comment;
import com.news.entity.Newsinfo;

public interface NewsinfoDao {
//所有新闻查询，分页
//获取新闻总数
	public Integer getCountOfAllNewsinfo();
	//分页查询
	public List getAllNewsinfoByPage(int page,int pageSize);	
	//根据条件查询新闻，分页
	//获取该条件下新闻总数
	public Integer getCountOfNewsinfo(Newsinfo condition);
	//根据条件分页
	public List getNewsinfoByConditionAndPage(
			Newsinfo condition,int page,int pageSize);
	//根据新闻id查询新闻
	public Newsinfo getNewsinfoById(int id);
	//根据id删除新闻
	public void deleteNews(int id);
	//添加新闻
	public void addNews(Newsinfo newsinfo);
	//更新新闻
	public void updateNews(Newsinfo newsinfo);
		
	public Comment getNewsCommentsById(int id);

}
