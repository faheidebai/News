package com.news.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.news.biz.AdminBiz;
import com.news.biz.NewsinfoBiz;
import com.news.biz.TopicBiz;
import com.news.entity.Admin;
import com.news.entity.Newsinfo;
import com.news.entity.Pager;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
public class AdminAction extends ActionSupport 
implements SessionAware,RequestAware {

	private Admin admin;
	Map<String,Object> session;
	Map<String,Object> request;
	private AdminBiz adminBiz;
	private NewsinfoBiz newsinfoBiz;
	private TopicBiz topicBiz;
	private Pager pager;
	private Newsinfo newsinfo;
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
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public Newsinfo getNewsinfo() {
		return newsinfo;
	}
	public void setNewsinfo(Newsinfo newsinfo) {
		this.newsinfo = newsinfo;
	}
	public void setNewsinfoBiz(NewsinfoBiz newsinfoBiz) {
		this.newsinfoBiz = newsinfoBiz;
	}
	public void setTopicBiz(TopicBiz topicBiz) {
		this.topicBiz = topicBiz;
	}
	public void setAdminBiz(AdminBiz adminBiz) {
		this.adminBiz = adminBiz;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
	public String validateLogin() throws Exception {
		// TODO Auto-generated method stub
		List list=this.adminBiz.login(admin);
		if(list!=null&&list.size()>0){
			Admin admin=(Admin)list.get(0);
			session.put("admin", admin);
			
		}
		return "index";
	}
	public String admin() throws Exception {
		int curPage=1;//默认值，第一次查询
		if(pager!=null){
			curPage=pager.getCurPage();
		}
		List newsinfoList=null;//新闻
		if(this.newsinfo==null){
			newsinfoList=this.newsinfoBiz.getAllNewsinfoByPage(curPage, 5);
			this.pager=this.newsinfoBiz.getPagerOfAllNewsinfo(5);
		}else{
			newsinfoList=this.newsinfoBiz.getNewsinfoByConditionAndPage(
					this.newsinfo, curPage, 5);
			this.pager=this.newsinfoBiz.getPagerOfNewsinfo(
					this.newsinfo, 5);
		}
		this.pager.setCurPage(curPage);
		List topicList=this.topicBiz.getAllTopics();//主题
		this.request.put("newsinfoList", newsinfoList);
		this.request.put("topicList", topicList);
		return "admin";
	}
	public String deleteNews() throws Exception {
		this.newsinfoBiz.deleteNews(this.newsinfo.getId());
		return "admin";
	}
	public String toNewsAdd() throws Exception {
		//获取主题列表
		List topicList=this.topicBiz.getAllTopics();
		this.request.put("topicList", topicList);
		return "news_add";
	}
	public String doNewsAdd() throws Exception {
		//作者，当前登录的管理员
		Admin admin=(Admin)this.session.get("admin");
		this.newsinfo.setAuthor(admin.getLoginName());
		//时间，格式化系统当前时间
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.newsinfo.setCreatedate(
				Timestamp.valueOf(sim.format(new Date())));
		
		this.newsinfoBiz.addNews(this.newsinfo);
		return "admin";
		
		
	}
	public String toModifyNews() throws Exception {
		//根据id获取新闻
		Newsinfo newsinfo=
				this.newsinfoBiz.getNewsinfoById(this.newsinfo.getId());
		//放入作用域
		this.request.put("newsinfo", newsinfo);
		//获取所有主题
		List topicList=this.topicBiz.getAllTopics();
		//放入作用域
		this.request.put("topicList", topicList);
		//跳转
		return "news_modify";
		
	}
	public String doNewsModify() throws Exception {
		//作者
		Admin admin=(Admin)this.session.get("admin");
		this.newsinfo.setAuthor(admin.getLoginName());
		//时间
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.newsinfo.setCreatedate(
				Timestamp.valueOf(sim.format(new Date())));
		//更新
		this.newsinfoBiz.updateNews(this.newsinfo);
		//跳转
		return "admin";
		
	}
	
}
