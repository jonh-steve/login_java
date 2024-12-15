<%@ page import="java.util.List" %>
<%@ page import="org.example.model.Product" %><%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://jakarta.apache.org/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://xmlns.jcp.org/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>

    <title>Product List</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #ccc;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
<%
    System.out.println("??????????????");
    List<Product> list = (List<Product>) request.getAttribute("listProduct");
    System.out.println(list);
    if (list == null) {
        response.sendRedirect("index.jsp");
    }else {

        System.out.println("??????????????");
    }
%>
<h1 style="text-align: center;">Product List</h1>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>
    </thead>
    <tbody>
    <!-- Using JSTL to iterate over the products -->
    <% assert list != null;
        for (Product product : list) {%>
        <tr>
            <td><%=product.getId()%></td>
            <td><%=product.getName()%></td>
            <td><%=product.getPrice()%></td>
            <td><%=product.getQuantity()%></td>
        </tr>
    <% }%>
    </tbody>
</table>

</body>
</html>