<%-- 
    Document   : Inicio
    Created on : 16/10/2017, 04:40:00 PM
    Author     : User
--%>
<%@page import="Model.Consulta"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Principal</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body background="fondo.jpg">

        <div class="container">
            <h1 class="col-md-4">BASES CONSULTA</h1>
            <div class="span12">&nbsp;</div>
            <div class="span12">&nbsp;</div>
            <div class="span12">&nbsp;</div>
            <div class="span12">&nbsp;</div>
            <div class="span12">&nbsp;</div>
            <div class="span12">&nbsp;</div>

            <div class="col-md-4">
                <a class href="Consultas">
                    <button type="button" class="btn btn-primary btn-lg">CONSULTA</button>
                </a>
             
            </div>
            
            
             <table class="table table-striped">
                            <tr>
                                <th>ID Colmena</th>
                                <th>Ubicacion</th>
                                <th>Fabrica</th>
                                <th>ID Colmena Madre</th>
                                <th>Total</th>
                                
                            </tr>
                            <% if (request.getAttribute("listaConsultas") != null) {
                                    ArrayList<Consulta> list = (ArrayList<Consulta>) request.getAttribute("listaConsultas");
                                    if (list != null)
                                        for (Consulta consulta : list) {
                            %>
                            <tr>
                                <td><%=consulta.getIdColmena()%></td>
                                <td><%=consulta.getUbicacion()%></td>
                                <td><%=activo.getFabrica()%></td>
                                <td><%=activo.getIdColmenaMadre()%></td>
                                <td><%=activo.getTotal()%></td>
                              
                               
                            </tr>
                            <% }
                                }
                            %>
                        </table>
            
            
            
        </div>
    </body>
</html>
