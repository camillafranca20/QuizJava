<%@page import="com.domain.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
        <h4><%= 100.0*Quiz.getLastGrade() %>%</h4>
        <h3>Média</h3>
        <h4><%= 100.0*Quiz.getGradeAverage() %>%</h4>
        <hr/>
        <a href="teste.jsp"><button class="badge">Iniciar Quiz</button></a>
        <a href="cadastro.jsp"><button class="badge">Cadastre-se Já</button></a>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="WEB-INF/footer.jspf" %>
</html>
