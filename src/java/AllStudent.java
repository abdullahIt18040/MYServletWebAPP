import mapper.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import java.util.List;

public class AllStudent extends HttpServlet {

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

BookDAO bookDAO=new BookDAO();


        try {

            List<Student> studentList=bookDAO.studentlist();
            //System.out.println(studentList);
            req.setAttribute("studentList",studentList);
            RequestDispatcher dispatcher=req.getRequestDispatcher("AllStudent.jsp");
            dispatcher.forward(req,resp);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
