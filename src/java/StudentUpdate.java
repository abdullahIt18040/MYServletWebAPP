import mapper.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdate {

public  int  Update(Student students)
{
    int  status;
    DBConnection dbConnection=new DBConnection();
    try {
        Connection connection= dbConnection.connect();
        String sql="update student set name=?,ID=?,email=?,password=? where dept=?";
        PreparedStatement statement=connection.prepareStatement(sql);

        statement.setString(1,students.getName());
        statement.setString(2,students.getID());
        statement.setString(3,students.getEmail());
        statement.setString(4,students.getPassword());
        statement.setString(5,students.getDept());



        status=statement.executeUpdate();
        dbConnection.disconncet(connection);

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return  status;

}

}
