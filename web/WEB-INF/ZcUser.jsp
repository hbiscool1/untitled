<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@  taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %><!--jstl标准标签库  -->
<%@  taglib uri="http://www.springframework.org/tags/form" prefix="fm"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ZcUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script><!--jQuery包  -->
  </head>
  
  
  <body>
    <script type="text/javascript">
    $(document).ready(function(){
     $("#io").blur(function(){
     var zh=$("#io").val();
        $.post('<%=path%>/ajax.html','zh='+zh ,   
   /*  function (data) {
       if(data.msg==0){
       $("#pp1").html("不可以使用");s
       }else{
        alert("可以使用");
       }
    }, */
    function(rs){
  
    var str="";
   for(var i=0;i<rs.length;i++){
   var str1=rs[i];
   	str+="<li>"+str1.loginName+"</li>";
   }
   $("#pp1").html(str); 

   },"json");
     
     })
     //  2
     $("#pp2").click(function(){      
      $.post('<%=path%>/ajax1.html','',function(rs){
    alert("1");
    var str="";
   for(var i=0;i<rs.length;i++){
   var str1=rs[i];
   
   	str+="<li>"+str1.userName+"</li>";
   }
   $("#pp1").html(str); 

   },"json");
     
     })
     
     })
     
    
    
    </script>
  
    <fm:form action="${pageContext.request.contextPath}/oo.html" method="post" modelAttribute="easybuy_userentity1">
    <h1>  ${ts} </h1>
    
    登录名浏览:<select name="loginName5" >
    <c:forEach items="${userlist}" var="p">
    <option value="${p.loginName} ">
    ${p.loginName} 
    </option>
    </c:forEach>
    </select><br/>
    登陆名:<input type="text" name="loginName"  id="io"  value="${easybuy_userentity1.loginName} "/><fm:errors path="loginName"></fm:errors><br/>
   用户名 :<input type="text" name="userName"  value="${easybuy_userentity1.userName} "/><fm:errors path="userName"></fm:errors><br/>
  密码:<input type="password" name="password" value="${easybuy_userentity1.password}" /> <fm:errors path="password"></fm:errors><br/>
  
  性别:男:<input type="radio" value="1" name="sex" ${easybuy_userentity1.sex=="1"?"checked":""} /> 女<input type="radio" value="2" name="sex" ${easybuy_userentity1.sex=="2"?"checked":""} />
  <fm:errors path="sex"></fm:errors>
  <br/>
 <input type="submit" value="提交">
    
    </fm:form>
     <div id="pp1"></div>
     <input type="button" id="pp2"  value="查看所有用户"/>
  </body>
</html>
