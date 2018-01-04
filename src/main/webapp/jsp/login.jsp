<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>登陆</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/reset.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/main.css">
<!--[if IE 6]>
<script type="text/javascript" src="js/DD_belatedPNG_0.0.8a-min.js"></script>
<script type="text/javascript" src="js/ie6Fixpng.js"></script>
<![endif]-->
</head>

<body>
<div class="headerBar">
	<div class="logoBar login_logo">
		<div class="comWidth">
			<div class="logo fl">
				<a href="#"><img src="${pageContext.request.contextPath }/resources/images/logo.png" alt="华网"></a>
			</div>
			<h3 class="welcome_title">欢迎登陆</h3>
		</div>
	</div>
</div>
<form action="${pageContext.request.contextPath }/users/login" method="post" >
<div class="loginBox">
<h3><s:actionerror/></h3>
	<div class="login_cont">
		<ul class="login">
			<li class="l_tit">用户名</li>
			<li class="mb_10"><input name="username" type="text" class="login_input user_icon"></li>
			<li class="l_tit">密码</li>
			<li class="mb_10"><input name="pwd" type="password" class="login_input user_icon"></li>
			
			<li><input type="submit"  class="login_btn"></li>
		</ul>
		
	</div>
	
</div>
</form>
<p align="center">${error}</p>
<div class="hr_25"></div>
<div class="footer">
	<p>版权所有，仿冒必究@copyright杭州华网信息技术有限公司</p>	
</div>
</body>
</html>
