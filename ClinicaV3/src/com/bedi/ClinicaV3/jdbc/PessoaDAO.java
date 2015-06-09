package com.bedi.ClinicaV3.jdbc;

import java.sql.*;
import java.util.Date;

import com.bedi.ClinicaV3.Model.Pessoa;

public class PessoaDAO {

	public boolean AddPessoa(Pessoa pessoa) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "insert into pessoa (nome, nascimento, CPF) values (?,?,?)";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setDate(2, (java.sql.Date) pessoa.getData());
			ps.setInt(3, pessoa.getCPF());
			//ps.setString(1, "Lombarde");
			//ps.setDate(2, new java.sql.Date(new Date().getTime()));
			
			
			ps.execute();
			System.out.println("Recorded in db");
			ps.close();
			System.out.println("Connection closed");
			return true;
		} catch (Exception e) {
			System.out.println("Catch...");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean DelPessoa(Pessoa pessoa) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "delete from pessoa where cpf like ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, pessoa.getCPF());
			ps.execute();
			
			
			System.out.println("Recorded in db: " + "Exluded " + pessoa.getCPF());
			ps.close();
			System.out.println("dbConnection closed");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean UpdatePessoa(Pessoa pessoa, int Id_Remove) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "update pessoa set nome = ?, cpf= ?, nascimento = ? where cpf = ?";
			//insert into pessoa (nome, cpf, nascimento) values ('testenome', 999888556, 2015-06-10);
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, pessoa.getNome()+"lala");
			ps.setInt(2, pessoa.getCPF());
			ps.setDate(3, new java.sql.Date(new Date().getTime()));
			System.out.println("teste Data: " + pessoa.getData());

			ps.setInt(4, Id_Remove);

			ps.execute();
			System.out.println("Recorded in db");
			ps.close();
			System.out.println("Connection closed");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}



