package com.bedi.ClinicaV3.jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

import com.bedi.ClinicaV3.Model.Pessoa;

public class PessoaDAO {
	Connection conexao = null;
	PreparedStatement statement = null;
	ResultSet generatedkeys = null;

	public boolean AddPessoa(Pessoa pessoa) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println(" Add pessoa Connected...");

			String sql = "insert into pessoa (nome, CPF, nascimento) values (?,?,?)";

			statement = conexao.prepareStatement(sql);
			statement.setString(1, pessoa.getNome());
			statement.setDate(3, (java.sql.Date) pessoa.getData());
			statement.setInt(2, pessoa.getCPF());
			//ps.setString(1, "Lombarde");
			//ps.setDate(2, new java.sql.Date(new Date().getTime()));


			statement.execute();
			System.out.println("Pessoa Recorded in db");
			statement.close();
			System.out.println("Connection closed");
			return true;
		} catch (SQLException e) {
			//System.out.println("Catch...");
			throw new RuntimeException(e);
			//return false;
		}
		finally{
			if(statement != null){
			}try {
				statement.close();
			} catch (SQLException e) {
				throw new SQLException(e);
			}
		}
	}

	public boolean DelPessoa(Pessoa pessoa) throws SQLException{
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Del pessoa Connected...");

			String sql = "delete from pessoa where id = ?";
			PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, 2);
			ps.execute();
			//RESULT SET
			generatedkeys = ps.getGeneratedKeys();
			//tests
			//generatedKeys.toString();
			//

			System.out.println("Pessoa Recorded in db: " + "Exluded " + pessoa.getCPF());
			ps.close();
			System.out.println("dbConnection closed\n");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean UpdatePessoa(Pessoa pessoa, int Id_Remove) throws SQLException{
		try {
			System.out.println("Connected...");

			String sql = "update pessoa set nome = ?, cpf= ?, nascimento = ? where cpf = ?";
			//insert into pessoa (nome, cpf, nascimento) values ('testenome', 999888556, 2015-06-10);

			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setInt(2, pessoa.getCPF());
			ps.setDate(3, new java.sql.Date(new Date().getTime()));
			System.out.println("teste Data: " + pessoa.getData());

			ps.setInt(4, Id_Remove);

			ps.execute();
			System.out.println("Pessoa Recorded in db");
			ps.close();
			System.out.println("Connection closed\n");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public Pessoa ListPessoas(int cpf) throws SQLException{
		try {
			System.out.println("Connected list pessoas...");
			Connection conexao = new ConnectionFactory().getConnection();
			ArrayList<Pessoa> y = new ArrayList<Pessoa>();

			String sql = "select * from pessoa";
			//insert into pessoa (nome, cpf, nascimento) values ('testenome', 999888556, 2015-06-10);

			PreparedStatement ps = conexao.prepareStatement(sql);
			System.out.println("Executing select * from...  ");

			ResultSet rs = ps.executeQuery(sql);
			while(rs.next())
			{
				Pessoa x = new Pessoa();
				
			    System.out.println("Unique ID: " + rs.getString(1));
			    System.out.println("Nome: " + rs.getString(2));
			    System.out.println("CPF: " + rs.getString(3));
			    System.out.println("Nascimento: " + rs.getString(4) + "\n\n");
				 
				x.setNome(rs.getString("nome"));
				x.setCPF(rs.getInt("cpf"));
				x.setData(rs.getDate("nascimento"));
				y.add(x);
			}
			ps.close();
			rs.close();

			for(Pessoa z : y) { 
				   if(z.getCPF() == cpf ){ 
				       return z;
				   }
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}