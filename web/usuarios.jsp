
<%@page import="com.domain.quiz.DataBase"%>
<%@page import="com.domain.quiz.Usuarios"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="WEB-INF/header.jspf" %>
<%
    int i = 0;
    ArrayList<Usuarios> lista_usuarios = DataBase.getUsuarios();
    if (request.getParameter("c") != null) {
        int id = Integer.parseInt(request.getParameter("c"));
        lista_usuarios.remove(i);
    }
%>
    <div class="container">
    <h2>Usuários</h2>
    <table class=" table table-striped table-hover" id="table-usuarios">
        <thead>
        <th>ID</th>
        <th>Nome</th>
        <th>Idade</th>
        <th>Email</th>
        <th>Nome de Usuário</th>
    </thead>
       <tbody>
            <% for (i = 0; i < lista_usuarios.size(); i++) {%>
            <tr class="table-row-click" data-href="cadastro.jsp?c=<%= i%>">
                <td> <%= i%></td>
                <td> <%= lista_usuarios.get(i).getNome()%></td>
                <td> <%= lista_usuarios.get(i).getIdade()%></td>
                <td> <%= lista_usuarios.get(i).getEmail()%></td>
                <td> <%= lista_usuarios.get(i).getNome_usuario()%></td>
            </tr>
            <%}%>
        </tbody>
    </table>
    <a href="cadastro.jsp" class="btn btn-primary">Cadastrar</a>
    </div>
    <%@include file="WEB-INF/footer.jspf" %>