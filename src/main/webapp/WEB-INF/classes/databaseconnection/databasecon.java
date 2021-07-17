package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://veda.clrjh7bcg8tr.us-east-2.rds.amazonaws.com:3306/activity","veda","vedhareddy");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
