<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="index-elements/index_top.jsp" />
<link href="CSS/read.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function checkComment(){
		var cauthor = document.getElementById("cauthor");
		var content = document.getElementById("ccontent");
		if(cauthor.value == ""){
			alert("用户名不能为空！！");
			return false;
		}else if(content.value == ""){
			alert("评论内容不能为空！！");
			return false;
		}
		return true;
	}
</script>
<div id="container">
  <jsp:include page="index-elements/index_sidebar.jsp"></jsp:include>
  <div class="main">
    <div class="class_type"> <img src="Images/class_type.gif" alt="新闻中心" /> </div>
    <div class="content">
      <ul class="class_date">
      	<li id='class_month'>      	
      	<!-- 显示主题 -->
      <s:iterator id="topic" value="#request.topicList">
      <a href="index?newsinfo.topic.id=${topic.id }&pager.curPage=1">
      ${topic.name}</a>
      </s:iterator>
     </li>
      </ul>
      <ul class="classlist">
        
        <table width="80%" align="center">
          <tr width="100%">
            <td colspan="2" align="center">${requestScope.newsinfo.title }</td>
          </tr>
          <tr><td colspan="2"><hr /></td></tr>
          <tr>
            <td align="center">作者：${requestScope.newsinfo.author }
                                类型：<a href="">${requestScope.newsinfo.topic.name }</a>
                               发布时间：${requestScope.newsinfo.createdate}</td>
          </tr>
          <tr>
            <td align="left"><strong>摘要：${requestScope.newsinfo.summary}</strong></td>
          </tr>
          <tr>
            <td colspan="2" align="center"></td>
          </tr>
          <tr>
            <td colspan="2">${requestScope.newsinfo.content}</td>
          </tr>
          <tr>
            <td colspan="2"><hr />
            </td>
          </tr>
        </table>
        <talbe>
        	<tr><td>评论</td></tr>
        	<s:iterator id="comment"  value="#requestScope.comment">
        		<tr>
        			<td>comment.users.username</td>
        			<td>comment.content</td>
        			<td>comment.createTime</td>
        		</tr>
        	</s:iterator>
        	
        </talbe>
      </ul>
    </div>
  </div>
</div>
