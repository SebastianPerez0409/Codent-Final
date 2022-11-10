<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información de los PMV</title>
    </head>
    <body>
        <h1>Información de los PMV</h1>
        <form action="./PMVServlet" method="POST">
            <table>
                <tr>
                    <td>PMV Id</td>
                    <td><input type="text" name="pmvId" value="${pmv.idPmv}" /></td>
                </tr>
                <tr>
                    <td>Ubicación</td>
                    <td><input type="text" name="ubicacion" value="${pmv.ubicacion}" /></td>
                </tr>
                <tr>
                    <td>Mensaje</td>
                    <td><input type="text" name="mensaje" value="${pmv.mensaje}" /></td>
                </tr>
                <tr>
                    <td>Estado</td>
                    <td><input type="text" name="estado" value="${pmv.estado}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <th>ID</th>
            <th>Ubicacion</th>
            <th>Mensaje</th>
            <th>Estado</th>
                <% %>
                <c:forEach items="${allPmvs}" var="pmv">
                <tr>
                    <td>${pmv.idPmv}</td>
                    <td>${pmv.ubicacion}</td>
                    <td>${pmv.mensaje}</td>
                    <td>${pmv.estado}</td>
                </tr>
            </c:forEach> 
        </table>
        <a href="index.html"> <button> Volver </button> </a>
    </body>
</html>