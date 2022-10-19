import mapper.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

public boolean insertstudent(Student students)throws SQLException{
    DBConnection dbConnection=new DBConnection();
   Connection jdbcconnection= dbConnection.connect();

    String sql="insert into student(name,ID,email,password,dept)values(?,?,?,?,?)";

    PreparedStatement statement=jdbcconnection.prepareStatement(sql);
    statement.setString(1,students.getName());
    statement.setString(2,students.getID());
    statement.setString(3,students.getEmail());
    statement.setString(4,students.getPassword());
    statement.setString(5,students.getDept());
      boolean insered=statement.executeUpdate()>0;
      statement.close();
      dbConnection.disconncet(jdbcconnection);

      return insered;



}

public List<Student> studentlist()throws SQLException{
        List<Student> studentList=new ArrayList<>();
    DBConnection dbConnection=new DBConnection();
  Connection jdbcconnection=  dbConnection.connect();

  String sql="select * from student";

        Statement statement=jdbcconnection.createStatement();
      ResultSet rs = statement.executeQuery(sql);

      while (rs.next())
      {
          String name=rs.getString("name");
          String ID=rs.getString("ID");
          String email=rs.getString("email");
          String password=rs.getString("password");
          String dept=rs.getString("dept");
          mapper.Student student=new mapper.Student();
          student.setName(name);
          student.setID(ID);
          student.setEmail(email);
          student.setPassword(password);
          student.setDept(dept);
          studentList.add((Student) student);

      }
dbConnection.disconncet(jdbcconnection);
      return studentList;





    }




}
