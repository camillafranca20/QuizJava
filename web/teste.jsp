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
            request.getParameter("3")
        });
        response.sendRedirect("index.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste: WebQuiz</title>
    </head>
    <body>
        <h1>WebQuiz</h1>
        <h2>Teste</h2>
        <hr/>
        <form>
            <%ArrayList<Questao> test = Quiz.getTeste();%>
            <%for(Questao q: test){%>
            <h4><%= q.getQuestao() %></h4>
                <%for(String alternative: q.getAlternativas()){%>
                <input type="radio" name="<%=test.indexOf(q)%>"
                       value="<%=alternative%>"/><%=alternative%>
                <%}%>
            <hr/>
            <%}%>
            <input type="submit" name="test" value="Concluir"/>
        </form>
    </body>
</html>
