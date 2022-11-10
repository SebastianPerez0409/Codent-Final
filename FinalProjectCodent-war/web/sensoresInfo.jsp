<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información de los Sensores</title>
    </head>
    <body>
        <h1>Información de los Sensores</h1>
        <form action="./SensoresServlet" method="POST">
            <table>
                <tr>
                    <td>Sensor Id</td>
                    <td><input type="text" name="sensorId" value="${sensores.idSensor}" /></td>
                </tr>
                <tr>
                    <td>Ubicación</td>
                    <td><input type="text" name="ubicacion" value="${sensores.ubicacion}" /></td>
                </tr>
                <tr>
                    <td>Estado</td>
                    <td><input type="text" name="estado" value="${sensores.estado}" /></td>
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
            <th>Ubicación</th>
            <th>Estado</th>
                <c:forEach items="${allSensores}" var="sen">
                <tr>
                    <td>${sen.idSensor}</td>
                    <td>${sen.ubicacion}</td>
                    <td>${sen.estado}</td>
                </tr>
            </c:forEach> 
        </table>
        <a href="index.html"> <button> Volver </button> </a>
    </body>
</html>