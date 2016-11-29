<%--
  Created by IntelliJ IDEA.
  User: tianf
  Date: 2016/8/4
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div>
  <a href="/hello/helloMethod">测试</a>
</div>

<div>
  <a href="/blog/insert">博客</a>
</div>


<form action="mvc/upload" method="post" enctype="multipart/form-data">
  <input type="file" name="file"><br>
  <input type="submit" value="submit">
</form>

</body>
</html>
