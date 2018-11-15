package com.news.biz;

import java.util.List;

import com.news.entity.Topic;

public interface TopicBiz {

	public List getAllTopics();
	public void deleteTopic(int id);
	public void addTopic(Topic topic);
	public Topic getTopicById(int id);
	public void updateTopic(Topic topic);
}
