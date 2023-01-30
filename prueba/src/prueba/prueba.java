package prueba;

import java.sql.Connection;
import java.sql.DriverManager;

public class prueba {
	public static void main(String args[]) {
		String jdbcurl = "jdbc:mysql://localhost:3306/ejemplo?useSSL=false";
		String user="root";
		String pass="";
		try {
			System.out.println("Conectando con: " + jdbcurl);
			Connection myConn = DriverManager.getConnection(jdbcurl, user, pass);
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		
	}
}
