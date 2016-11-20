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
        
        <script>
            function enviar(){
                var x = document.getElementById("nome").value;
                if(!!x){
                    document.login.submit();
                }
            }
        </script>
    </head>
    <body>
        <%@ include file="WEB-INF/header.jspf" %>
        <div class="container">    
        <div class="row">
            <div class="col-md-12">
        <center>
        <div class="form">
            <form name="login" action="home.jsp" method="POST">
                <div class="form-group">
                    <label for="nome">Nome de usuário</label>
                </div>
                    <div class="form-group">
                    <input type="text" class="form-control" name="nome" placeholder="Username" id="nome"/>
                    </div>
                    <div class='form-group'>
                    <input class="btn btn-primary" type="submit" name="entrar" value="Entrar" />
                    </div>
                
                    
            </form>
            <a href="cadastro.jsp"><button class="badge">Cadastre-se Já</button></a>
        </div>
        </center>
        </div>
        </div>
        </div>
        <%@ include file="WEB-INF/footer.jspf" %>
    </body>
</html>
