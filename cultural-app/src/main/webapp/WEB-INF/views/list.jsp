<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Bandas ciclo auxiliar</title>
</head>
<body>
    <h1>Bandas ciclo auxiliar</h1>
    <ol>
        <c:forEach items="${bandas}" var="banda">
            <li>${banda}</li>
        </c:forEach>
    </ol>
    <h1>Tabla de bandas</h1>
    <table border="1">
        <thead>
            <tr>
                <th>id</th>
                <th>Nombre</th>
                <th>Cantidad de integrantes</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${bandas}" var="banda">
                <tr>
                    <td>${banda.id}</td>
                    <td>${banda.name}</td>
                    <td>${banda.members}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
