<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri='/struts-tags' prefix='s' %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="console_element/top.jsp" />
<script type="text/javascript">
	function check(){
		var title = document.getElementById("title");
		var summary = document.getElementById("summary");
		var content = document.getElementById("content");
		
		if(title.value == ""){
			alert("标题不能为空！！");
			title.focus();
			return false;
		}else if(summary.value == ""){
			alert("摘要不能为空！！");
			summary.focus();
			return false;
		}else if(content.value == ""){
			alert("内容不能为空！！");
			content.focus();
			return false;
		}		
		return true;
	}
</script>

<div id="main">
  <jsp:include page="console_element/left.html" />
  <div id="opt_area">
    <h1 id="opt_type"> 修改新闻： </h1>
    <form action="doNewsModify" method="post" onsubmit="return check()">
    <!-- 隐藏域,更新时需根据主键更新 -->
      <s:hidden name="newsinfo.id" value="%{#request.newsinfo.id}"></s:hidden>
      
      <p>        
  <s:select name="newsinfo.topic.id" label="主题" 
     list="#request.topicList" listKey="id" 
     listValue="name" value="%{#request.newsinfo.topic.id}" cssClass="opt_input" />
      </p>
      <p>
        <s:textfield id="title" label="标题" name="newsinfo.title" 
        cssClass="opt_input" value="%{#request.newsinfo.title}"  />
      </p>      
      <p>
        <s:textarea id="summary" label="摘要" name="newsinfo.summary" 
        value="%{#request.newsinfo.summary}" cols="40" rows="3"  />
      </p>
      <p>
         <s:textarea id="content" label="内容" name="newsinfo.content" 
         value="%{#request.newsinfo.content}" cols="70" rows="10" />        
      </p>   
      <br>
     <p>
         <s:submit value="提交" cssClass="opt_sub" align="center" />  
      </p> 
    </form>    
  </div>
</div>

