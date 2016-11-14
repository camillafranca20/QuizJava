<%-- 
    Document   : cadastro
    Created on : 13/11/2016, 17:13:58
    Author     : Gustavo
--%>

<%@page import="com.domain.quiz.Quiz"%>
<%@page import="com.domain.quiz.DataBase"%>
<%@page import="com.domain.quiz.Usuarios"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Usuarios> lista_usuarios = new DataBase().getUsuarios();
    if (request.getParameter("salvar")!=null) {
            Usuarios usr = new Usuarios();
            usr.setNome(request.getParameter("nome"));
            usr.setIdade(request.getParameter("idade"));
            usr.setEmail(request.getParameter("email"));
            usr.setNome_usuario(request.getParameter("nome_usuario"));
            lista_usuarios.add(usr);
            response.sendRedirect("teste.jsp");
        }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>World domination quiz</title>
    </head>
    <body>
    <%@ include file="WEB-INF/header.jspf" %> 
    <div class="container">
        <%@ include file="WEB-INF/menu.jspf" %>     
        <div class="row">
            <div class="col-md-6">
                <form>
                    Nome: <input type="text" name="nome">
                    Idade: <input type="text" name="idade">
                    Cidade: <input type="text" name="cidade">
                    E-mail: <input type="text" name="email">
                    Nome de acesso: <input type="text" name="acesso">
                    <input type="submit" name="salvar" value="Iniciar teste">
                </form>
            </div>
        </div>
    </div>
    <%@ include file="WEB-INF/footer.jspf" %>
    </body>
</html>