<%@page import="mapper.Student"%>
<jsp:useBean id="u" class="BookDAO"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
   // int i=BookDAO.update(u);
    response.sendRedirect("viewusers.jsp");
%>