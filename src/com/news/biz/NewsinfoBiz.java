package com.news.biz;

import java.util.List;

import com.news.entity.Comment;
import com.news.entity.Newsinfo;
import com.news.entity.Pager;

public interface NewsinfoBiz {

	//获取分页新闻
	public List getAllNewsinfoByPage(int page,int pageSize);
	//获取pager属性
	public Pager getPagerOfAllNewsinfo(int pageSize);
	
	//根据条件获取分页新闻
	public List getNewsinfoByConditionAndPage(
			Newsinfo condition,int page,int pageSize);
	//获取条件Pager属性
	public Pager getPagerOfNewsinfo(Newsinfo condition,int pageSize);
	//根据新闻id查询新闻
	public Newsinfo getNewsinfoById(int id);
	//根据id删除新闻
	public void deleteNews(int id) ;
	//添加新闻
	public void addNews(Newsinfo newsinfo);
	//更新新闻
	public void updateNews(Newsinfo newsinfo);
	
	public Comment getNewsCommentsById(int id);
}
