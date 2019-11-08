<%--
  Created by IntelliJ IDEA.
  User: Hbiscool9
  Date: 2019/11/7
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
  <body>
    <form action="<%= path%>/tpaperSt" method="post">
      <h1>${tishi}</h1>
    标题: <input type="text" name="title" /></br>
    类型: <input type="text" name="type" /></br>
    性质:<input type="text" name="paperSummary"/></br>
    内容:<input type="text" name="paperContext" /></br>
    作者:<input type="text" name="createdBy"/> </br>
    时间：<input type="text" name="creationDate"/>
    <input type="submit" value="提交"/>

</form>


</body>
</html>
