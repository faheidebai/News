<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="console_element/top.jsp" />
<%@ taglib uri='/struts-tags' prefix='s' %>
<script type="text/javascript">
	function check(){
		var name = document.getElementById("name");

		if(name.value == ""){
			alert("请输入主题名称！！");
			name.focus();
			return false;
		}		
		return true;
	}
</script>
<div id="main">
  <jsp:include page="console_element/left.html" />
  <div id="opt_area">
    <h1 id="opt_type">修改主题： </h1>
    <s:form action="" method="post" onsubmit="return check()">
    <s:hidden name="" value=""></s:hidden>
      <p>
        <s:textfield label="主题名称" id="name" name="" 
        value="" cssClass="opt_input" />
      </p> 
       
      <p>
        <s:submit value="提交" cssClass="opt_sub" />
      </p>     
    </s:form>
  </div>
</div>
