package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	
	private String hostname;
	private int port;
	private String database;
	private String username;
	private String password;
	
	private Connection connection;
	
	public DataSource () {
		try {
			hostname = "localhost";
			port = 3306;
			database = "projetomv";
			username = "root";
			password = "PrtScr11!!";
			
			String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("DEU CERTO");
		}
		catch (SQLException e) {
			System.out.println("ERRO na Conexão: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("ERRO geral: " + e.getMessage());
		}
	}
	
	public Connection getConnection () {
		return this.connection;
	}
	
	public void closeDataSource() {
		try {
			connection.close();
		}
		catch (Exception e) {
			System.out.println("Erro ao desconectar: " + e.getMessage());			
		}
	}
	

}