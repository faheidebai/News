package com.news.dao;

import java.util.List;

import com.news.entity.Comment;
import com.news.entity.Newsinfo;

public interface NewsinfoDao {
//�������Ų�ѯ����ҳ
//��ȡ��������
	public Integer getCountOfAllNewsinfo();
	//��ҳ��ѯ
	public List getAllNewsinfoByPage(int page,int pageSize);	
	//����������ѯ���ţ���ҳ
	//��ȡ����������������
	public Integer getCountOfNewsinfo(Newsinfo condition);
	//����������ҳ
	public List getNewsinfoByConditionAndPage(
			Newsinfo condition,int page,int pageSize);
	//��������id��ѯ����
	public Newsinfo getNewsinfoById(int id);
	//����idɾ������
	public void deleteNews(int id);
	//�������
	public void addNews(Newsinfo newsinfo);
	//��������
	public void updateNews(Newsinfo newsinfo);
		
	public Comment getNewsCommentsById(int id);

}
