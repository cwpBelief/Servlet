<%--
  Created by IntelliJ IDEA.
  User: 16545
  Date: 2022/9/3
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page
        contentType="text/html;charset=UTF-8"
        language="java" %>
<html>
<head>
    <title>
        Title</title>
</head>
<body>
<%--  POST 请求 会在tomcat8以上的版本 乱码--%>
<form method="post" action="ser03">
    姓名：<input type="text" name="username">
<%--    // name 传递的就是参数--%>
    <br>
    密码 <input type="text" name="password"><br>
    <button>登录</button>
    
    
    
</form>
</body>
</html>
