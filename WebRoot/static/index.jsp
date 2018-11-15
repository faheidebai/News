<%@ page language="java" import="java.util.*,com.news.entity.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="index-elements/index_top.jsp" />
<div id="container">

  <div class="main">
    <div class="class_type"> <img src="Images/class_type.gif" alt="新闻中心" /> </div>
    <div class="content">
      <ul class="class_date">
      	<li id='class_month'>    
      	 <!-- 循环显示主题列表 -->  	
      <s:iterator id="" value="">
      <a href=""></a>
      </s:iterator>
      </ul>
      <ul class="classlist"> 
        <!-- 循环显示当前页新闻列表 -->     
        <s:iterator id="" value="">
               <li>
             <a href=""></a><span></span>
             </li>
          </s:iterator>  
        <!-- 分页超链接部分 -->
        <p align="center">
        <a>首页</a>
	   <a>上一页</a>
	  
			<a >下一页</a>
			<a >尾页</a>
	    </p>
       </ul>
    </div>   
  </div>
</div>

