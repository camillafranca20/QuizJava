<%-- 
    Document   : login
    Created on : 16/11/2016, 17:19:02
    Author     : arauj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">    
        <div class="row">
            <div class="col-md-12">
            <center>
        <div class="form">
            <form action="" method="POST">
                <div class="form-group">
                    <label for="nome">Nome de usuário</label>
                    <input type="text" class="form-control" name="nome" placeholder="Username" value="" />
                    <input class="btn btn-primary" type="submit" name="submit" value="Entrar" />
                </div>
            </form>
        </div>
        </div>
        </div>
        </div>
        <%@ include file="WEB-INF/footer.jspf" %>
    </body>
</html>
