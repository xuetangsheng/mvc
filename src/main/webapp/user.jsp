<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/19 0019
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user}--${requestScope.user}--${user.uname}--${requestScope.user.sal}--${sessionScope.user.pwd}
</body>
</html>
