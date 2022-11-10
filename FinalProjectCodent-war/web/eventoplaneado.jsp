<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evento planeado</title>
    </head>
    <body>
        <form action="./EventoPlaneado" method="POST">
            <br>
            <button> MOSTRAR EVENTOS </button>
            <br>
            <br>
            <br>
            <table border="1">
                <th>ID</th>
                <th>Descripcion</th>
                <th>Via</th>
                <th>Sensor</th>
                <th>Estado</th>
                    <c:forEach items="${allEvento}" var="ev">
                    <tr>
                        <td>${ev.idEvento}</td>
                        <td>${ev.descripcion}</td>
                        <td>${ev.via}</td>
                        <td>${ev.sensor}</td>
                        <td>${ev.estado}</td>
                    </tr>
                </c:forEach> 
            </table>
            <table>
                <tr>
                    <td>Digíte el ID del evento que desea activar</td>
                    <td><input type="text" name="idEvento"/></td>
                </tr>
            </table>
            <br>
            <input type="submit" name="action" value="ACTIVAR EVENTO" />
        </form>
        <br>
        <br>
        <br>

        <a href="index.html"> <button> Volver </button> </a>
    </body>
</html>
