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
                      主题：<s:select name="" list="" listKey="" listValue="" cssClass="opt_input" />
         &nbsp;&nbsp; &nbsp;新闻标题：<s:textfield name="" />
          <s:submit value="查询" />
   </s:form>
        
        
    <ul class="classlist"> 
    <s:iterator id="" value="">
    	 	<li>
    	 	<span> 作者：&#160;&#160;&#160;&#160; 
    	 	<a href=''>修改</a> &#160;&#160;&#160;&#160; 
    	 	<a href='' onclick='return clickdel()'>删除</a> 
    	 	</span> 
    	 	</li>
         
     </s:iterator>
            <p align="center">
			
      <a>首页</a>
	   <a>上一页</a>
	  
		
		
			<a >下一页</a>
			<a >尾页</a>
	  
	    </p>
		
		
    </ul>
  </div>
</div>

