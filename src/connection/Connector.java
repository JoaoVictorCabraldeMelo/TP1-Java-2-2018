package connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connector {
	private static final String url = "jdbc:mysql://localhoost:3306/bancodedados";
	private static final String user = "root";
	private static final String password = "";
	private static final String driver = "com.mysql.cj.jdbc.Driver";

	public static Connection getConnection() {
		
		try {
			Class jdbcDriverClass = Class.forName(driver);
           // driver = (Driver) jdbcDriverClass.newInstance();
            DriverManager.registerDriver((Driver) jdbcDriverClass.newInstance());
            return DriverManager.getConnection(url, user, password);
		}
		catch (Exception e) {
			System.out.println("Deu ruim brasil!"+e);
		}
		
		return null;
	}
	
	public static void closeConnection (Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch(Exception e) {
				System.out.println("Deu ruim Brasil!\n"+e);
			}
		}
	}
	
	public static void closeConnection (Connection con, PreparedStatement stmt) {
		closeConnection(con);
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch(Exception e) {
				System.out.println("Deu ruim Brasil!\n"+e);
			}
		}
	}
	
	public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet res) {
		closeConnection(con, stmt);
		
		if (res != null) {
			try {
				res.close();
			} catch(Exception e) {
				System.out.println("Deu ruim Brasil!\n"+e);
			}
		}
	}
}
