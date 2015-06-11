import java.sql.*;
import java.util.Date;

import com.bedi.ClinicaV3.Model.Animal;
import com.bedi.ClinicaV3.Model.Pessoa;
import com.bedi.ClinicaV3.jdbc.AnimalDAO;
import com.bedi.ClinicaV3.jdbc.PessoaDAO;

public class Main {
	public static void main(String[] args) throws SQLException {		
		PessoaDAO pessoadao = new PessoaDAO();
		
		//Pessoa 1//
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Oraldo");
		pessoa.setCPF(45);
		pessoa.setData(new java.sql.Date(new Date().getTime()));
		
		
		pessoadao.AddPessoa(pessoa);
		
		//Pessoa 2//
		Pessoa pessoa2 = new Pessoa();
		pessoa.setNome("Jeremias");
		pessoa.setCPF(777777777);
		pessoa.setData(new java.sql.Date(new Date().getTime()));
		pessoadao.AddPessoa(pessoa2);
		
		//Animal//
		Animal animal = new Animal();
		animal.setNome("Totó");
		animal.setRaca("Lata Vira");
		animal.setData(new java.sql.Date(new Date().getTime()));
		AnimalDAO animalDao = new AnimalDAO();
		animalDao.AddAnimal(animal);;
		
		//pessoa 1 é o clodovil//	
		//pessoadao.DelPessoa(pessoa);
		
		/*
		//System.out.println("Adding Animal: " + pessoa.getNome());
		System.out.println("Totó agora é tété");
		animal.setNome("Totó agora é tété");
		animalDao2.UpdateAnimal(animal, 1);*/
		
		Pessoa y = pessoadao.ListPessoas(45);
		
		System.out.println("Returned: " + y.getNome());

	}
}