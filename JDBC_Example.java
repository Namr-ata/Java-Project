import java.sql.*;  
public class JDBC_Example {
    public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/java","root","");  
//here java is database name, root is username and password is empty  
Statement stmt=con.createStatement(); 
System.out.println("connection created");

 //creating table 
/*
String query="create table user (id int(15) primary key auto_increment,fname varchar(25) not null,lname varchar(25))";
Statement st=con.createStatement();
st.execute(query);
System.out.println("Table created sucessfully");
*/
//inserting values
/*
String query="insert into user(fname,lname) values('Kusum','Katwal')";
Statement st=con.createStatement();
int i=st.executeUpdate(query);
System.out.println(i+" row insert sucessfully");
*/
//dynamic insert
/*
String q="insert into user(fname,lname) values(?,?)";
PreparedStatement pst=con.prepareStatement(q);
pst.setString(1,"Nima");
pst.setString(2,"pakhrin");
pst.executeUpdate();*/
//update query
String sql = "UPDATE user SET lname= 'Adhikari' WHERE id = 3"; 
   //Statement stm=con.createStatement();
  int i= stmt.executeUpdate(sql); 
   System.out.println("Record updated."); 
//show result 
ResultSet rs=stmt.executeQuery("select * from user");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
con.close(); 
     
}catch(Exception e){ System.out.println(e);}  
}  
}
