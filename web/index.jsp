<%@page import="com.domain.quiz.Quiz"%>
<%@page import="com.domain.quiz.Usuarios" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.domain.quiz.DataBase"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArrayList<Usuarios> user = DataBase.getUsuarios();
%>
<html>
    <%if (request.getParameter("logon")== null) {%>
        <%@ include file="WEB-INF/header.jspf" %>   
    <%}%>
    <%if (request.getParameter("logon")!=null) {%>
        <%@include file="WEB-INF/logado.jspf" %>
    <%}%>
    <div class="container">
        <%@ include file="WEB-INF/menu.jspf" %>
        <div class="row">
            <div class="col-md-6">
        <h1>WORLD Domination Quiz!</h1>
        <hr/>
        <h3>Última nota</h3>
        <h4><%= 100.0*Quiz.getLastGrade() %>%</h4>
        <h3>Média</h3>
        <h4><%= 100.0*Quiz.getGradeAverage() %>%</h4>
        <hr/>
        <a href="teste.jsp"><button class="badge">Iniciar Quiz</button></a>
            <a href="cadastro.jsp"><button class="badge">Cadastre-se Já</button></a>
            </div>
        </div>
    </div>
    <%@ include file="WEB-INF/footer.jspf" %>
</html>
