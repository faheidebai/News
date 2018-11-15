package com.news.biz;

import java.util.List;

import com.news.entity.Comment;
import com.news.entity.Newsinfo;
import com.news.entity.Pager;

public interface NewsinfoBiz {

	//��ȡ��ҳ����
	public List getAllNewsinfoByPage(int page,int pageSize);
	//��ȡpager����
	public Pager getPagerOfAllNewsinfo(int pageSize);
	
	//����������ȡ��ҳ����
	public List getNewsinfoByConditionAndPage(
			Newsinfo condition,int page,int pageSize);
	//��ȡ����Pager����
	public Pager getPagerOfNewsinfo(Newsinfo condition,int pageSize);
	//��������id��ѯ����
	public Newsinfo getNewsinfoById(int id);
	//����idɾ������
	public void deleteNews(int id) ;
	//�������
	public void addNews(Newsinfo newsinfo);
	//��������
	public void updateNews(Newsinfo newsinfo);
	
	public Comment getNewsCommentsById(int id);
}
