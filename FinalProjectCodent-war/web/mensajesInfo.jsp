<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información del Mensaje</title>
    </head>
    <body>
        <h1>Información del Mensaje</h1>
        <form action="./MensajesServlet" method="POST">
            <table>
                <tr>
                    <td>Mensajes Id</td>
                    <td><input type="text" name="msgId" value="${mensajes.idMensajes}" /></td>
                </tr>
                <tr>
                    <td>Descripción</td>
                    <td><input type="text" name="descripcion" value="${mensajes.descripcion}" /></td>
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
            <th>Descripción</th>
                <c:forEach items="${allMensajes}" var="msg">
                <tr>
                    <td>${msg.idMensajes}</td>
                    <td>${msg.descripcion}</td>
                </tr>
            </c:forEach> 
        </table>
         <a href="index.html"> <button> Volver </button> </a>
    </body>
</html>