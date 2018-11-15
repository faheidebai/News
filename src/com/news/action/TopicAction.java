package com.news.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.news.biz.TopicBiz;
import com.news.entity.Topic;
import com.opensymphony.xwork2.ActionSupport;

public class TopicAction extends ActionSupport implements SessionAware, RequestAware {

	Map<String,Object> request;
	Map<String,Object> session;
	
	private Topic topic;
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	private TopicBiz topicBiz;
	public void setTopicBiz(TopicBiz topicBiz) {
		this.topicBiz = topicBiz;
	}
	

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;

	}

	
	public String topiclist() throws Exception {
		// TODO Auto-generated method stub
		//��ȡ��������
		List topicList=this.topicBiz.getAllTopics();
		//����������
		this.request.put("topicList", topicList);
		//��ת
		return "topic_list";
	}
	public String deleteTopic() throws Exception {
		this.topicBiz.deleteTopic(this.topic.getId());
		return "topic_list";
	}
	public String addTopic() throws Exception {
		this.topicBiz.addTopic(this.topic);
		return "topic_list";
	}
	public String toModifyTopic() throws Exception {
		//��ѯ��ȡTopic����
		Topic topic=this.topicBiz.getTopicById(this.topic.getId());
		//����������
		this.request.put("topic", topic);
		//��ת
		return "topic_modify";
	}
	public String doTopicModify() throws Exception {
		//����Topic����
		this.topicBiz.updateTopic(this.topic);
		//��ת
		return "topic_list";
	}
}
