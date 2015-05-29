package org.sergio.cllinicaveterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import org.sergio.ClinicaVeterinaria.jdbc.ConnectionFactory;

public class Main {

	public static void main(String[] args) {
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");

			String sql = "insert into pessoa (cpf, nome, nascimento) values (?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, 369811969);
			ps.setString(2, "Osnildo");
			ps.setDate(3, new java.sql.Date(new Date().getTime()));

			ps.execute();
			System.out.println("Recorded in db");
			ps.close();
			System.out.println("Connection closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	