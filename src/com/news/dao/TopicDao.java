package com.news.dao;

import java.util.List;

import com.news.entity.Topic;

public interface TopicDao {

	//��ȡ��������
	public List getAllTopics();
	//����idɾ������
	public void deleteTopic(int id);
	//�������
	public void addTopic(Topic topic);
	//����id��ѯ����
	public Topic getTopicById(int id);
	//��������
	public void updateTopic(Topic topic);
	
	
}
