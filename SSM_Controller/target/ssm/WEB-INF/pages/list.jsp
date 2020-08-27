<%--
  Created by IntelliJ IDEA.
  User: 宋成坤
  Date: 2020/8/22
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--要先开启el表达式不忽略isELIgnored="false"--%>
<%--在开启jsp的标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="300px">
    <tr>
        <th>编号</th>
        <th>账户名称</th>
        <th>账户金额</th>
    </tr>


    <c:forEach items="${list}" var="account" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${account.name }</td>
            <td>${account.money }</td>
        </tr>
    </c:forEach>
</table>
    <%--<h3>查询所有账号信息</h3>
    <c:forEach items="${requestScope.list}" var="account">
        ${account.name}
    </c:forEach>--%>

</body>
</html>
