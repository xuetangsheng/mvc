<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/19 0019
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--通过request作用域取或直接取--%>
<form action="dataUser" method="post">
    姓名:<input type="text" name="uname"><br/>
    密码:<input type="password" name="pwd"><br/>
    工资:<input type="text" name="sal"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
