<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Zc.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <form action="<%=path %>/cc.html" method="post" >
     <h1>注册</h1>
         <div>${tishi}</div>
    账户:<input type="text" name="zh"/>
  密码  :<input type="password" name="mm"/>
 打篮球: <input type="checkbox" name="like" value="打篮球" />
  英雄联盟:<input type="checkbox" name="like" value="LOL"/>
  <input type="submit" value="提交">
  </body>
</html>
