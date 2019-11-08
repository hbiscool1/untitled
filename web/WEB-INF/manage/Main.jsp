<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();//绝对路径根路径
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="<%= path %>/css/style.css" />
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->
        
    <script type="text/javascript" src="<%= path %>/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="<%= path %>/js/menu.js"></script>    
        
	<script type="text/javascript" src="<%= path %>/js/select.js"></script>
        
    
<title>尤洪</title>
</head>
<body>  
<!--Begin Header Begin-->
<div class="m_top_bg">
    <div class="top">
        <div class="m_logo"><a href="Index.html"><img src="<%= path %>/images/logo1.png" /></a></div>
        <div class="m_search">
            <form>
                <input type="text" value="" class="m_ipt" />
                <input type="submit" value="搜索" class="m_btn" />
            </form>                      
            <span class="fl"><a href="#">咖啡</a><a href="#">iphone 6S</a><a href="#">新鲜美食</a><a href="#">蛋糕</a><a href="#">日用品</a><a href="#">连衣裙</a></span>
        </div>
    </div>
</div>
<!--End Header End--> 
<div class="i_bg bg_color">
    <!--Begin 用户中心 Begin -->
	<div class="m_content">
   		<div class="m_left">
        	<div class="left_n">管理中心</div>
            <div class="left_m">
            	<div class="left_m_t t_bg1">账户管理</div>
                <ul>
                	<li><a href="<%=path %>/manage/fy1" class="now" target="right">查看所有</a></li>
                    <li><a href="Member_Address.html">新增</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg1">商品类别管理</div>
                <ul>
                	<li><a href="/Easybuy/Registservlet" class="now" target="right">查看所有</a></li>
                    <li><a href="Member_Address.html">新增</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg1">商品管理</div>
                <ul>
                	<li><a href="/Easybuy/manage/SpFyCx.jsp" class="now" target="right">查看所有</a></li>
                    <li><a href="/Easybuy/manage/SpAdd.jsp" target="right">新增</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg1">新闻管理</div>
                <ul>
                	<li><a href="Member_Order.html" class="now">查看所有</a></li>
                    <li><a href="Member_Address.html">新增</a></li>
                </ul>
            </div>
        </div>
       <iframe src="/Easybuy/manage/Add.jsp" frameborder="0" name="right" width="970" height="1000" ></iframe>
	 
    </div>
	 
        
</div>

</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>