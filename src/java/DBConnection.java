import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
 public static String jdbcURl;
 public static String  jdbcUsername;
 public static String jdbcpassword;
 public static Connection jdbcconnection;


   public DBConnection() {
      this.jdbcURl = jdbcURl;
      this.jdbcUsername = jdbcUsername;
      this.jdbcpassword = jdbcpassword;


   }




   protected Connection connect() throws SQLException {
      if(jdbcconnection==null || jdbcconnection.isClosed())
      {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
         }
         jdbcconnection=DriverManager.getConnection(jdbcURl,jdbcUsername,jdbcpassword);


      }
      return jdbcconnection;

   }

   protected void disconncet(Connection jdbcconnection) throws SQLException
   {
      if(jdbcconnection!=null || !jdbcconnection.isClosed()){
         jdbcconnection.close();

      }
   }


}
