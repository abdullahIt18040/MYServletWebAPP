import mapper.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDelete {

    public  static   int deletestudent(String dept)
    {
        int status=0;
        DBConnection dbConnection=new DBConnection();
        try {
            Connection connection= dbConnection.connect();
            String sql="delete from student where dept=?";
            PreparedStatement statement=connection.prepareStatement(sql);

            statement.setString(1,dept);
            status=statement.executeUpdate();


            dbConnection.disconncet(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return status;

    }
}
