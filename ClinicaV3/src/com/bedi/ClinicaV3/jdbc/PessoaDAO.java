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
			
			String sql = "delete from Pessoa where (cpf) like values (?)";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, pessoa.getCPF());
			//ps.setString(2, pessoa.getNome());
			//ps.setDate(3, new java.sql.Date(new Date(0).getTime()));

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
	
	public boolean UpdatePessoa(Pessoa pessoa) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Connected...");
			
			String sql = "insert into Pessoa (cpf, nome, nascimento) values (?,?,?)";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, pessoa.getCPF());
			ps.setString(2, pessoa.getNome());
			ps.setDate(3, new java.sql.Date(new Date(0).getTime()));

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



