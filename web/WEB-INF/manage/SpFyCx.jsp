<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@  taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %><!--jstl标准标签库  -->
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script><!--jQuery包  -->
    <base href="<%=basePath%>">
    
    <title>My JSP 'SpFyCx.jsp' starting page</title>
    
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
 
  <script>
 $(document).ready(function(){
      /*   var yjid=null;
        var ejid=null;
        <c:if test="${!empty yjid}">
        yjid=${yjid};       
       </c:if>  
        <c:if test="${!empty ejid}">
        ejid=${ejid};       
       </c:if>   */
       $.ajax({
       "url":"/Easybuy/XzSpServlet5555",//路径
      "type":"get",//提交方式
       "data":"num55=1",//传数据   传字符串过去
       "dataType":"json",
       "success":function(rs){
       var str="";
       for(var i=0;i<rs.length;i++){
       var str1=rs[i];
         
        str+="<option value="+str1.id+"  >"+str1.name+"</option>";
       }
       
  
       $("#yj").append(str);
    
       }
       })
       
   
       $("#yj").change(function(){
         
         var num=$(this).val();//拿value
         if(num==""){
         var str="<option >全部</option>";
         $("#ej").html(str);
         $("#sj").html(str);
         }
          $.ajax({
   "url":"/Easybuy/XzSpServlet5555",//路径
   "type":"get",//提交方式
   "data":"num55=2&&type="+num,//传数据   传字符串过去
   "dataType":"json",
   "success":function(rs){
       var str="";
     for(var i=0;i<rs.length;i++){
     var str1=rs[i];
    
    str+="<option value="+str1.id+"  >"+str1.name+"</option>";
   }
   $("#ej").html(str); 
     $("#ej").change();
   }
   })
       })
       
       $("#ej").change(function(){
       var num=$(this).val();
      
       
         $.ajax({
   "url":"/Easybuy/XzSpServlet5555",//路径
   "type":"get",//提交方式
   "data":"num55=3&&type="+num,//传数据   传字符串过去
   "dataType":"json",
   "success":function(rs){
       var str="";
     for(var i=0;i<rs.length;i++){
     var str1=rs[i];
   	str+="<option value="+str1.id+" >"+str1.name+"</option>";
   }
   $("#sj").html(str); 
   }
   })
       })
    })
   
  </script>
   <form action="/Easybuy/SpCx">
  id:<input type="text" name="id55" value="${id}"/> &nbsp &nbsp 商品名称:<input type="text" name="name" value="${name} "/> &nbsp &nbsp 备注:<input type="text" name="beizhu" value="${beizhu}"/><br/><br/>  
  价格范围:<input type="text" name="jiage1" value="${jiage1} "/>~~<input type="text" name="jiage2" value="${jiage2} "/>  &nbsp &nbsp 库存数量:<input type="text"/><br/><br/> 
  一级类别:<select id="yj" name="yj"><option value="">全部</option></select>&nbsp &nbsp 二级类别:<select id="ej" name="ej"><option value="">全部</option></select>&nbsp &nbsp
  三级类别<select id="sj" name="sj"><option >全部</option></select> &nbsp &nbsp<input type="submit" value="查询">
  </form>
  
  <table>
  
  <tr>
  <td>商品图片</td>
  <td>商品名称</td>
  <td>商品备注</td>
  <td>价格</td></tr>
  <c:forEach items="${q5}" var="p">
  <tr>
  <td><img src="${p.zp} "></td>
  <td>${p.name}  </td>
  <td>${p.note} </td>
  <td>${p.price} </td>
  </tr>  
  </c:forEach>

  </table>

  </body>
</html>
