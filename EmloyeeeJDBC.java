import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class EmloyeeeJDBC {

	
	public static void main(String[] args) {
		

	try {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical","root","password123");
		java.sql.Statement statement = connection.createStatement();
		System.out.println("Connection sucessfully");
   // 	statement.executeUpdate("create table Employeed(id INT(5),name varchar(60),phone INT(15),address varchar(150),email varchar(50),department varchar(25))");	
		
  //	System.out.println("Table Created successfully");
		PreparedStatement prestatement=connection.prepareStatement("insert into Employeed values(?,?,?,?,?,?)");
		prestatement.setInt(1, 101);
		prestatement.setString(2, "Rahul");
		prestatement.setInt(3, 586442);
		prestatement.setString(4, "MH");
		prestatement.setString(5,"abc123@gmail.com");
		prestatement.setString(6, "mechanical");
		int result=prestatement.executeUpdate();
		System.out.println(result);
		System.out.println("Table column inserted");
		statement.close();
		prestatement.close();
		connection.close();
		
	}catch(Exception e) {
		e.printStackTrace();
		

	}
	
	
	}
	
}
