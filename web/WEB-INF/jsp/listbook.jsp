<%--
  Created by IntelliJ IDEA.
  User: HjaLenovo
  Date: 2020/5/12
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<table id="bookTable">
    <thead style="background: yellow">
        <td>ID</td>
        <td>NAME</td>
        <td>Author</td>
        <td>Price</td>
        <td>Sales</td>
        <td>Stock</td>
        <td>操作</td>
    </thead>

    <c:forEach items="${list}" var="l">
        <tr>
            <td>${l.id}</td>
            <td>${l.name}</td>
            <td>${l.author}</td>
            <td>${l.price}</td>
            <td>${l.sales}</td>
            <td>${l.stock}</td>
            <td>
                <a href="${pageContext.request.contextPath}/book/delete?id=${l.id}">delete</a>
                <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${l.id}">update</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/book/toAddBook">添加图书</a>
</body>
</html>
