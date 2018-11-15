package com.news.dao;

import java.util.List;

import com.news.entity.Topic;

public interface TopicDao {

	//获取所有主题
	public List getAllTopics();
	//根据id删除主题
	public void deleteTopic(int id);
	//添加主题
	public void addTopic(Topic topic);
	//根据id查询主题
	public Topic getTopicById(int id);
	//更新主题
	public void updateTopic(Topic topic);
	
	
}
