<%--
  Created by IntelliJ IDEA.
  User: HjaLenovo
  Date: 2020/5/13
  Time: 0:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="form" method="post" action="${pageContext.request.contextPath}/book/addBook">
    <table id="bookTable">
        <thead style="background: yellow">
            <td>NAME</td>
            <td>Author</td>
            <td>Price</td>
            <td>Sales</td>
            <td>Stock</td>
            <td>操作</td>
        </thead>
        <tr>
            <td>
                <input type="text" name="name" value="" placeholder="请输入书名">
            </td>
            <td>
                <input type="text" name="author" value="" placeholder="请输入作者">
            </td>
            <td>
                <input type="text" name="price" value="" placeholder="请输入价格">
            </td>
            <td>
                <input type="text" name="sales" value="" placeholder="请输入sales">
            </td>
            <td>
                <input type="text" name="stock" value="" placeholder="请输入数量">
            </td>
            <td>
                <input type="submit" value="ok">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
