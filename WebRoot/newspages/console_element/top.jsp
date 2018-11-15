<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<s:if test="#session.admin==null"><!-- 访问控制 -->
	<script type="text/javascript">
		alert("当前页面访问受限，请重新登录管理账户！");
		open("/news/index","_self");	
	</script>
</s:if>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>新闻发布系统管理后台</title>
<link href="/news/CSS/admin.css" rel="stylesheet" type="text/css" />
<div id="header">
  <div id="welcome">欢迎使用新闻管理系统！</div>
  <div id="nav">
    <div id="logo"><img src="/news/Images/logo.jpg" alt="新闻中国" /></div>
    <div id="a_b01"><img src="/news/Images/a_b01.gif" alt="" /></div>
  </div>
</div>
<div id="admin_bar">
  <div id="status">管理员：${sessionScope.admin.loginName} 登录  &#160;&#160;&#160;&#160; <a href="/news/logout.jsp">login out</a></div>
  <div id="channel"> </div>
</div>
</head>
<body>
