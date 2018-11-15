<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="console_element/top.jsp" />

<script language="javascript">
	function clickdel(){
		return confirm("删除请点击确认");
	}	
</script>

<div id="main">
  <jsp:include page="console_element/left.html" />
  <div id="opt_area"> 
  
     
   <s:form ation="admin" method="post" theme="simple">
                      主题：
     <s:select name="newsinfo.topic.id" list="#request.topicList" listKey="id" listValue="name" 
     cssClass="opt_input" />
         &nbsp;&nbsp; &nbsp;新闻标题：<s:textfield name="newsinfo.title" />
          <s:submit value="查询" />
   </s:form>
        
        
    <ul class="classlist"> 
    <s:iterator id="news" value="#request.newsinfoList">
    	 	<li>${news.title}
    	 	<span> 作者：${news.author }&#160;&#160;&#160;&#160; 
    	 	<a href='toModifyNews?newsinfo.id=${news.id}'>修改</a> &#160;&#160;&#160;&#160; 
    	 	<a href='deleteNews?newsinfo.id=${news.id}' onclick='return clickdel()'>删除</a> 
    	 	</span> 
    	 	</li>
         
     </s:iterator>
            <p align="center">
	<s:if test="pager.curPage>1">
<a href="admin?pager.curPage=1&newsinfo.topic.id=${requestScope.newsinfo.topic.id }&newsinfo.title=${requestScope.newsinfo.title}">首页</a>
<a href="admin?pager.curPage=${pager.curPage-1}&newsinfo.topic.id=${requestScope.newsinfo.topic.id }&newsinfo.title=${requestScope.newsinfo.title}">上一页</a>
	 </s:if> 
		
		
	<s:if test="pager.curPage<pager.pageCount">
<a href="admin?pager.curPage=${pager.curPage+1}&newsinfo.topic.id=${requestScope.newsinfo.topic.id }&newsinfo.title=${requestScope.newsinfo.title}">下一页</a>
<a href="admin?pager.curPage=${pager.pageCount}&newsinfo.topic.id=${requestScope.newsinfo.topic.id }&newsinfo.title=${requestScope.newsinfo.title}">尾页</a>
	  </s:if>
	    </p>
		
		
    </ul>
  </div>


</div>

