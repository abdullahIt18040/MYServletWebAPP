package mapper;

public class Student {

   private String name;
   private String ID;
   private String email;
   private String password;
   private String dept;

//   public Student(String name, String ID, String email, String password, String dept) {
//      this.name = name;
//      this.ID = ID;
//      this.email = email;
//      this.password = password;
//      this.dept = dept;
//   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getID() {
      return ID;
   }

   public void setID(String ID) {
      this.ID = ID;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getDept() {
      return dept;
   }

   public void setDept(String dept) {
      this.dept = dept;
   }


   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", ID='" + ID + '\'' +
              ", email='" + email + '\'' +
              ", password='" + password + '\'' +
              ", dept='" + dept + '\'' +
              '}';
   }
}
