
//Question 5. Establish a jdbc connection to a database and print first 10 rows of the table.

import java.sql.*;
import java.util.*;

public class Question5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Connection connection = null;
		System.out.println("Enter Database URL");
		final String DB_URL = s.next();//jdbc:mysql://localhost:3306/asset

		System.out.println();
		System.out.println("Enter Credentials : ");
		System.out.println();
		System.out.println("Enter User : ");//Gunjan
		final String User = s.next();
		System.out.println();
		System.out.println("Enter Password : ");//P@ssw0rd
		final String Password = s.next();
		System.out.println();
		s.close();
		Statement stmt = null;
		try {
			
			// Opening a connection
			System.out.println("Connecting to a selected database...");
			connection = DriverManager.getConnection(DB_URL, User, Password);
			System.out.println("Connected database successfully...");

			//Execute a query
			System.out.println("Creating statement...");
			stmt = connection.createStatement();

			String sql = "SELECT * FROM user_information limit 0,10;";
			ResultSet rs = stmt.executeQuery(sql);
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name

				String email = rs.getString("email");
				String userName = rs.getString("user_name");

				// Display values
				System.out.println("Email_Id: " + email);
				System.out.println("User_Name: " + userName);
				System.out.println();

			}
			rs.close();
		} catch (SQLException se) {

			se.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		
		}
	}
	
}

/*
Output

Enter Database URL
jdbc:mysql://localhost:3306/asset

Enter Credentials : 

Enter User : 
Gunjan

Enter Password : 
P@ssw0rd

Connecting to a selected database...
Connected database successfully...
Creating statement...
Email_Id:  atish.bhatia2609@gmail.com
User_Name:  Atish

Email_Id:  gunjan.bhatia2609@gmail.com
User_Name:  Gunjan Bhatia

Email_Id:  asha.bhatia2609@gmail.com
User_Name:  Asha

Email_Id:  ginni.bhatia@gmail.com
User_Name:  Ginni

Email_Id: bla.bhatia
User_Name: Bla

Email_Id:  bla.bhatia1
User_Name:  Bla

Email_Id:  Jiya.bhatia
User_Name:  Jiya

Email_Id:  priya.arora@gmail.com
User_Name:  Priya

Email_Id:  riya@gmail.com
User_Name: Riya

Email_Id: riya@gmail.com
User_Name: Riya


 */
