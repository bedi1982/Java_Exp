package com.bedi.ClinicaV3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	public Connection getConnection(){
		try {
			Connection conexao = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/ClinicaVeterinariaV3", "root","root");
			return conexao;
		} catch (SQLException e) {
			System.out.println("catch!");
			throw new RuntimeException(e);
		}
	}
}