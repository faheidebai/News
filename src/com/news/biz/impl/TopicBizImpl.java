package com.news.biz.impl;

import java.util.List;

import com.news.biz.TopicBiz;
import com.news.dao.TopicDao;
import com.news.entity.Topic;
public class TopicBizImpl implements TopicBiz {

	private TopicDao topicDao;
	
	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
	}

	@Override
	public List getAllTopics() {
		// TODO Auto-generated method stub
		return this.topicDao.getAllTopics();
	}

	@Override
	public void deleteTopic(int id) {
		// TODO Auto-generated method stub
		this.topicDao.deleteTopic(id);
	}

	@Override
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		this.topicDao.addTopic(topic);
	}

	@Override
	public Topic getTopicById(int id) {
		// TODO Auto-generated method stub
		return this.topicDao.getTopicById(id);
	}

	@Override
	public void updateTopic(Topic topic) {
		// TODO Auto-generated method stub
		this.topicDao.updateTopic(topic);
	}

}
