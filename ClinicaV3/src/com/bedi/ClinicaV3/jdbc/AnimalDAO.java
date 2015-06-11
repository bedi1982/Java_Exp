package com.bedi.ClinicaV3.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.bedi.ClinicaV3.Model.Animal;

public class AnimalDAO {
	
	public boolean AddAnimal(Animal animal) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "insert into animal (nome, nascimento, raca) values (?,?,?)";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, animal.getNome());
			ps.setDate(2, (java.sql.Date) animal.getData());
			ps.setString(3, animal.getRaca());
			//ps.setString(1, "Lombarde");
			//ps.setDate(2, new java.sql.Date(new Date().getTime()));
			
			ps.execute();
			System.out.println("Animal Recorded in db");
			ps.close();
			System.out.println("Connection closed");
			return true;
		} catch (Exception e) {
			System.out.println("Catch...");
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean DelPessoa(Animal animal, int id) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "delete from animal where Nr like ?" + "delete from animal where nome = null";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			
			System.out.println("Animal Recorded in db: " + "Exluded " + animal.getNome());
			ps.close();
			System.out.println("dbConnection closed");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean UpdateAnimal(Animal animal, int Nr_Remove) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "update animal set nome = ?, raca= ?, nascimento = ? where ID = ?";
			//insert into pessoa (nome, cpf, nascimento) values ('testenome', 999888556, 2015-06-10);
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, animal.getNome()+"lala");
			ps.setString(2, animal.getRaca());
			ps.setDate(3, new java.sql.Date(new Date().getTime()));

			ps.setInt(4, Nr_Remove);
			System.out.println("Executing update query: ");
			ps.execute();
			System.out.println("Animal Recorded in db");
			ps.close();
			System.out.println("Connection closed");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean ListAnimal() throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "select * from animal";
			//insert into pessoa (nome, cpf, nascimento) values ('testenome', 999888556, 2015-06-10);
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			System.out.println("Executing select * from...  ");

			ResultSet rs = ps.executeQuery(sql);
			System.out.println("me");
			while(rs.next())
			{
			    System.out.println("Unique ID: " + rs.getString(1));
			    System.out.println("Nome: " + rs.getString(2));
			    System.out.println("Raça: " + rs.getString(3));
			    System.out.println("Nascimento: " + rs.getString(4) + "\n\n");
			}

			//System.out.println("Animal Recorded in db");
			ps.close();
			System.out.println("Connection closed");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	

}
