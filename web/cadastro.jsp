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
    // Título da Inclusão
    String acao = "Usuários - Cadastrar";
    // Array do database na variável "lista_usuario"
    ArrayList<Usuarios> lista_usuarios = new DataBase().getUsuarios();
    // Declaração de variável vazia
    Usuarios usr = null;
    // Declarando variável id  com um valor -1
    int id = -1;
    // Condição se a resquest do form é igual POST ele faz, ele pega o parâmetro da ID.
    if (request.getMethod() == "POST") {
        id = Integer.parseInt(request.getParameter("id"));
        usr = (id == -1) ? new Usuarios() : lista_usuarios.get(id);
    // Condição de exclusão    
            if (request.getParameter("submit").equals("Excluir")) {
                lista_usuarios.remove(id);
    // Condição de edição e inclusão da ação. 
            }else {
                usr.setNome(request.getParameter("nome"));
                usr.setIdade(request.getParameter("idade"));
                usr.setEmail(request.getParameter("email"));
                usr.setNome_usuario(request.getParameter("nome_usuario"));
                    if (id == -1) {
                    lista_usuarios.add(usr);
                    }
            }
    // Resposta enviada para página "usuarios.jsp" .        
    response.sendRedirect("usuarios.jsp");
    // Condição de inclusão da ação. 
    }else if (request.getParameter("c") == null) {
        usr = new Usuarios();
        usr.setNome("");
        usr.setIdade("");
        usr.setEmail("");
        usr.setNome_usuario("");
    // Página de edição.     
    }else {
        id = Integer.parseInt(request.getParameter("c"));
        usr = lista_usuarios.get(id);
        acao = "Usuários - Editar";
    }
%>
    <%@ include file="WEB-INF/header.jspf" %> 
    <body>
    <div class="container">    
        <div class="row">
            <div class="col-md-12">
            <center>
                <h1> <%= acao%> </h1>
                <hr/>
        <div class="form">
            <form action="" method="POST">
                <input type="hidden" name="id" value="<%= id%>">
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" class="form-control" name="nome" placeholder="Caio dos Santos de Araujo" value="<%= usr.getNome()%>" />
                </div>
                <div class="form-group">
                    <label for="rg">Idade</label>
                    <input type="text" class="form-control" name="idade" placeholder="00" required value="<%= usr.getIdade()%>"/>
                </div>
                <div class="form-group">
                    <label for="E-mail">Email</label>
                    <input type="email" class="form-control" name="email" placeholder="user@domain.com" value="<%= usr.getEmail()%>" />
                </div>
                <div class="form-group">
                    <label for="Telefone">Nome do Usuário</label>
                    <input type="text" class="form-control" name="nome_usuario" placeholder="user" value="<%= usr.getNome_usuario()%>"/>
                </div>
                <input class="btn btn-primary" type="submit" name="submit" value="Salvar" />
                <%
                    if (acao != "Usuários - Cadastrar") {%>
                        <button class="btn btn-danger" id="deleteUsr" type="submit" name="submit" value="Excluir">
                            Excluir
                        </button>
                <%
                    }
                %>
                <a href="index.jsp" class="btn btn-info">Voltar</a>
            </form>
        </div>
            </center>        
            </div>
        </div>
    </div>
    <%@ include file="WEB-INF/footer.jspf" %>
    </body>
</html>