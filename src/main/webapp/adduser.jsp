<%--
  Created by IntelliJ IDEA.
  User: 073105
  Date: 2018/7/27
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "//" + request.getServerName()
            + request.getServerPort() + path + "/";
%>

<html>
    <head>
        <base href="<%=basePath%>"/>
       <%-- <base> 标签为页面上的所有链接规定默认地址或默认目标。
        通常情况下，浏览器会从当前文档的 URL 中提取相应的元素来填写相对 URL 中的空白。
        使用 <base> 标签可以改变这一点。浏览器随后将不再使用当前文档的 URL，而使用指定的基本 URL 来解析所有的相对 URL。这其中包括 <a>、<img>、<link>、<form> 标签中的 URL。
        --%>
        <style type="text/css">
            form {
                margin: 0px auto;

                width: 500px;
                height: 20px;
            }
        </style>

        <title>添加用户</title>
    </head>
    <body>

    <h1>SSM整合</h1>
    <form action="${pageContext.request.contextPath}/userAction.do" method="post">
        用户名:<input name="name"/><br>
        用户年龄：<<input name="age"/><br>
        <input type="submit" value="save"/>

    </form>

    </body>
</html>
