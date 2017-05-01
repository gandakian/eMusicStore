<%--
  Created by IntelliJ IDEA.
  User: amirbhujel
  Date: 5/1/17
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>

    <table>
        <thead>
        <tr>
            <th>Product</th>
            <th>Category</th>
            <th>Condition</th>
            <th>Price</th>
        </tr>
        </thead>

        <tr>
            <td>${product.productName}</td>
            <td>${product.productCategory}</td>
            <td>${product.productCondition}</td>
            <td>${product.productPrice}</td>
        </tr>
    </table>

</body>
</html>
