import mapper.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        String name=req.getParameter("name");
        String ID=req.getParameter("id");
        String email=req.getParameter("Email");
        String password=req.getParameter("password");
        String dept=req.getParameter("dept");

        Student students=new Student();


        students.setName(name);
        students.setID(ID);
        students.setEmail(email);
        students.setPassword(password);
        students.setDept(dept);


        StudentUpdate studentUpdate=new StudentUpdate();
  int status=  studentUpdate.Update(students);
        if(status>0)
        {
            resp.sendRedirect("./allstudent");
        }else {

            System.out.println("sorry !  unable to update ...");
        }


        out.close();
    }
}
