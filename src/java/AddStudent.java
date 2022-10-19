import mapper.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class AddStudent extends HttpServlet {
    DBConnection dbConnection;

    public  void init()
    {
        String jdbcURl=getServletContext().getInitParameter("jdbcURl");
        String jdbcUsername=getServletContext().getInitParameter("jdbcUsername");
        String jdbcpassword=getServletContext().getInitParameter("jdbcpassword");

        DBConnection.jdbcURl=jdbcURl;
        DBConnection.jdbcUsername=jdbcUsername;
        DBConnection.jdbcpassword=jdbcpassword;




       // dbConnection=new DBConnection(jdbcURl,jdbcUsername,jdbcpassword);

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String name=req.getParameter("name");
//       // String ID=req.getParameter("ID");
//        String email=req.getParameter("email");
//       // String password=req.getParameter("password");
//        String dept=req.getParameter("dept");


        Student student=new Student();
        student.setName(req.getParameter("name"));
        student.setID(req.getParameter("ID"));
        student.setEmail(req.getParameter("email"));
        student.setPassword(req.getParameter("password"));
        student.setDept(req.getParameter("dept"));

     //  System.out.println(""+student);

       BookDAO bookDAO=new BookDAO();
        try {
            boolean isinsert= bookDAO.insertstudent(student);

            if(isinsert)
            {
                System.out.println(" student inserted success fully .........");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
