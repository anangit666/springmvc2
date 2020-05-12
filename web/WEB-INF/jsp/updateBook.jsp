<%--
  Created by IntelliJ IDEA.
  User: HjaLenovo
  Date: 2020/5/13
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>图书信息更改</title>
</head>
<body>
<form id="form" method="post" action="updateBook">
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
        <tr>
            <td>
                <p>${book.id}</p>
            </td>
            <td>
                <input type="text" name="name" value="${book.name}">
            </td>
            <td>
                <input type="text" name="author" value="${book.author}">
            </td>
            <td>
                <input type="text" name="price" value="${book.price}">
            </td>
            <td>
                <input type="text" name="sales" value="${book.sales}">
            </td>
            <td>
                <input type="text" name="stock" value="${book.stock}">
            </td>
            <td>
                <input type="submit" value="submit">
            </td>
        </tr>
        <%-- 隐藏的标签 --%>
        <input hidden="hidden" value="${book.id}" name="id">
    </table>
</form>
</body>
</html>
