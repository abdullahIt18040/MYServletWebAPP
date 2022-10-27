import mapper.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {





    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>  Update student </h1>");
        String dept=req.getParameter("dept");

        Student students=BookDAO.GetstudentByDept(dept);









        out.print("<form action='./updatestudent' method='post'>");
        out.print("<table>");
        out.print("<tr>name<td></td><td><input type='text' name='name' id='name' value='"+students.getName()+"'/></td></tr>");
        out.print("<tr><td>ID:</td><td><input type='text' name='id' id='id' value='"+students.getID()+"'/></td></tr>");
        out.print("<tr><td>Email:</td><td><input type='email' name='Email'  id='Email' value='"+students.getEmail()+"'/> </td></tr>");
        out.print("<tr><td>Password:</td><td><input type='text' name='password' id='password' value='"+students.getPassword()+"'/> </td></tr>");

        out.print("<tr><td>Dept:</td><td><input type='text' name='dept' id='dept' value='"+students.getDept()+"'/></td></tr>");

        out.print("</td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
        out.print("</table>");
        out.print("</form>");

        out.close();
    }
}
