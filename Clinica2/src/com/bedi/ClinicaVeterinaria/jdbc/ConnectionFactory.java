package com.bedi.ClinicaVeterinaria.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			Connection conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cliinicaveterinariadb",
					"root","positivo");
			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
