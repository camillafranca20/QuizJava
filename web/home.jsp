<%@page import="com.domain.quiz.Quiz"%>
<%@page import="com.domain.quiz.Usuarios" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.domain.quiz.DataBase"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
String nome = "";
    int a = 0;
    String n = "";
    DataBase d = new DataBase();
    if (request.getParameter("entrar") != null) {
            nome = request.getParameter("nome");
            Usuarios u = new Usuarios();
            u.setNome_usuario(nome);
            for (Usuarios usuarios : d.getUsuarios()) {
                    if(usuarios.getNome_usuario().equals(nome)){
                        a = 1;
                        n = usuarios.getNome();
                        break;
                    }
                }
            if(a!=1){
                response.sendRedirect("cadastro.jsp");
            }
    }            
%>
<html>
    
    <%@ include file="WEB-INF/header.jspf" %>
    <div class="container">
    <%@ include file="WEB-INF/menu.jspf" %>
        <div class="row">
            <div class="col-md-6">
                <div class="container">
        <h1>WORLD Domination Quiz!</h1>
        <hr/>
        <h3>Última nota</h3>
        <h4><%= 100.0*Quiz.getUltimaNotaUser() %>%</h4>
        <h3>Média</h3>
        <h4><%= 100.0*Quiz.getMediaUser() %>%</h4>
        <hr/>
        <h1>Usuário: <%= n %> </h1>
        <form action="teste.jsp">
        <input type="hidden" name="name_login" value="<%= n %>">
        <a href="quiz.jsp"><button class="badge">Iniciar Quiz</button></a>
        </form>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="WEB-INF/footer.jspf" %>
</html>
