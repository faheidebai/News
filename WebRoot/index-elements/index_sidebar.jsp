<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:action name="indexsidebar" executeResult="false" namespace="/"></s:action>
<div class="sidebar">
    <h1> <img src="Images/title_1.gif" alt="国内新闻" /> </h1>
    <div class="side_list">
      <ul>    
        <!-- 循环显示5条国内新闻  -->  	  
      	<s:iterator id="domesticNews" value="#request.domesticNewsList">
      		<li> <a href='newsread?newsinfo.id=${domesticNews.id}'><b>${domesticNews.title} </b></a> </li>
      	</s:iterator>
      </ul>
    </div>
    <h1> <img src="Images/title_2.gif" alt="国际新闻" /> </h1>
    <div class="side_list">
      <ul>    
      <!-- 循环显示5条国际新闻  -->  	
    		<s:iterator id="internationalNews" value="#request.internationalNewsList">
      		<li> <a href='newsread?newsinfo.id=${internationalNews.id}'><b>${internationalNews.title} </b></a> </li>
      	</s:iterator>
    
      </ul>
    </div>    
  </div>

