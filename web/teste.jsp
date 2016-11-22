
<%@page import="com.domain.quiz.DataBase"%>
<%@page import="com.domain.quiz.Usuarios"%>
<%@page import="com.domain.quiz.Quiz"%>
<%@page import="com.domain.quiz.Questao"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(request.getParameter("test")!=null){
        Quiz.validateTest(new String[]{
            request.getParameter("0"),
            request.getParameter("1"),
            request.getParameter("2"),
            request.getParameter("3"),
            request.getParameter("4"),
            request.getParameter("5"),
            request.getParameter("6"),
            request.getParameter("7") 
        });
        response.sendRedirect("home.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste: WebQuiz</title>
    </head>
    <body>
        <%@ include file="WEB-INF/logado.jspf" %>
        <div class="container">
        <%@ include file="WEB-INF/menu.jspf" %>
        <div class="container">
            <h1>Domination Quiz</h1>
            <h2>Usuário: <%= request.getParameter("name_login") %></h2>
            <h2>Matéria: </h2>
            <hr/>
            <center>
	            <div class="recent-posts">
                        <img src="img/hicon.png">
	            </div>
            </center>
            <form>
                <%ArrayList<Questao> test = Quiz.getTeste();%>
                <%for(Questao q: test){%>
                <h4><%= q.getQuestao() %></h4>
                    <%for(String alternative: q.getAlternativas()){%>
                    <input type="radio" style="margin-left: 20px" name="<%=test.indexOf(q)%>"
                           value="<%=alternative%>"/><%=alternative%>
                    <%}%>
                <hr/>
                <%}%>
                <a href="home.jsp"><input type="submit" name="test" class="btn btn-primary" value="Concluir"/></a>
            </form>
            </div>
        </div>
                <%@ include file="WEB-INF/footer.jspf" %>
    </body>
</html>
