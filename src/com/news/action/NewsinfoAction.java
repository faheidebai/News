package com.news.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.news.biz.NewsinfoBiz;
import com.news.biz.TopicBiz;
import com.news.entity.Comment;
import com.news.entity.Newsinfo;
import com.news.entity.Pager;
import com.news.entity.Topic;
import com.opensymphony.xwork2.ActionSupport;

public class NewsinfoAction extends ActionSupport 
implements RequestAware, SessionAware {

	private NewsinfoBiz newsinfoBiz;
	private TopicBiz topicBiz;
	
	public void setNewsinfoBiz(NewsinfoBiz newsinfoBiz) {
		this.newsinfoBiz = newsinfoBiz;
	}

	public void setTopicBiz(TopicBiz topicBiz) {
		this.topicBiz = topicBiz;
	}

	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;

	}
	Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;

	}
	private Pager pager;//��ȡҳ�룬ÿҳ����

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}
	private Newsinfo newsinfo;//��ȡ����

	public Newsinfo getNewsinfo() {
		return newsinfo;
	}

	public void setNewsinfo(Newsinfo newsinfo) {
		this.newsinfo = newsinfo;
	}

	
	public String index() throws Exception {
		// TODO Auto-generated method stub
		int curPage=1;//Ĭ��ֵ����һ�β�ѯ
		if(pager!=null){
			curPage=pager.getCurPage();
		}
		List newsinfoList=null;//����
		if(this.newsinfo==null){
			newsinfoList=
					this.newsinfoBiz.getAllNewsinfoByPage(curPage, 5);
			this.pager=this.newsinfoBiz.getPagerOfAllNewsinfo(5);
		}else{
			newsinfoList=this.newsinfoBiz.getNewsinfoByConditionAndPage(
					this.newsinfo, curPage, 5);
			this.pager=this.newsinfoBiz.getPagerOfNewsinfo(
					this.newsinfo, 5);
		}
		this.pager.setCurPage(curPage);
		
		List topicList=this.topicBiz.getAllTopics();//����
		//����������
		this.request.put("newsinfoList", newsinfoList);
		this.request.put("topicList", topicList);
//		ServletActionContext.getRequest().setAttribute(
//				"newsinfoList", newsinfoList);
//		ServletActionContext.getRequest().setAttribute(
//				"topicList", topicList);
		
		return "index";
	}


	public String indexsidebar() throws Exception {
		// TODO Auto-generated method stub
		//��ѯ���ڹ��ʵ�ǰ��������
		//����
		Newsinfo condition=new Newsinfo();
		Topic topic=new Topic();
		topic.setId(1);//��������
		condition.setTopic(topic);
		List domesticNewsList=
		this.newsinfoBiz.getNewsinfoByConditionAndPage(condition, 1,5);
		//��������
		topic.setId(2);
		condition.setTopic(topic);
		List internationalNewsList=
		this.newsinfoBiz.getNewsinfoByConditionAndPage(condition, 1,5);
		
		//����������
		request.put("domesticNewsList", domesticNewsList);
		request.put("internationalNewsList", internationalNewsList);
		//��ת
		return "index_sidebar";
	}

	
	public String newsread() throws Exception {
		// TODO Auto-generated method stub
		//��ѯ����
		Newsinfo newsinfo=this.newsinfoBiz.getNewsinfoById(this.newsinfo.getId());
		Comment comment =this.newsinfoBiz.getNewsCommentsById(this.newsinfo.getId());
		request.put("newsinfo", newsinfo);
		request.put("comment", comment);
		//��ѯ��������
		List topicList=this.topicBiz.getAllTopics();
		request.put("topicList", topicList);
		return "news_read";
	}
	

	

}
