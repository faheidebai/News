<%@ page language="java" import="java.util.*,com.news.entity.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<jsp:include page="index-elements/index_top.jsp" />
<div id="container">
<jsp:include page="index-elements/index_sidebar.jsp"></jsp:include>
  <div class="main">
    <div class="class_type"> <img src="Images/class_type.gif" alt="新闻中心" /> </div>
    <div class="content">
      <ul class="class_date">
      	<li id='class_month'>    
      	 <!-- 循环显示主题列表 -->  	
      <s:iterator id="topic" value="#request.topicList">
      <a href="index?newsinfo.topic.id=${topic.id }&&pager.curPage=1">${topic.name}</a>
      </s:iterator>
      </ul>
      <ul class="classlist"> 
        <!-- 循环显示当前页新闻列表 -->     
        <s:iterator id="news" value="#request.newsinfoList">
               <li>
             <a href="newsread?newsinfo.id=${news.id}">${news.title}</a><span>${news.createdate}</span>
             </li>
          </s:iterator>  
        <!-- 分页超链接部分 -->
         <p align="center">
        <s:if test="pager.curPage>1">
        
       <a href="index?pager.curPage=1&&
       newsinfo.topic.id=${requestScope.newsinfo.topic.id}">首页</a>
	   <a href="index?pager.curPage=${pager.curPage-1 }
	   &&newsinfo.topic.id=${requestScope.newsinfo.topic.id}">上一页</a>
	  
	   </s:if>
	   <s:if test="pager.curPage<pager.pageCount">
	 
	   <a href="index?pager.curPage=${pager.curPage+1 }
	   &&newsinfo.topic.id=${requestScope.newsinfo.topic.id}">下一页</a>
	   <a href="index?pager.curPage=${pager.pageCount}
	   &&newsinfo.topic.id=${requestScope.newsinfo.topic.id}">尾页</a>
	  
	   </s:if>
	     </p>
       </ul>
    </div>   
  </div>
</div>

