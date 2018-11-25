package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.*;
import main.*;

public class ClienteDAO {
	public static void inCliente (Cliente cli) {
		Connection con = Connector.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("insert into Cliente (nome, sobrenome) values (?,?)");
			stmt.setString(1, cli.getNome());
			stmt.setString(2, cli.getCpf());
			stmt.executeUpdate();
		} catch(Exception e) {
			System.out.println("Deu erro");
		} finally {
			Connector.closeConnection(con, stmt);
		}
	}
}
