import java.sql.*;
import java.util.Date;

import com.bedi.ClinicaV3.Model.Pessoa;
import com.bedi.ClinicaV3.jdbc.PessoaDAO;


public class Main {

	public static void main(String[] args) throws SQLException {
		
		//Manual//
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Clodovil");
		pessoa.setCPF(999999999);
		pessoa.setData(new java.sql.Date(new Date().getTime()));
		
		System.out.println("Data: " + pessoa.getData());
		
		PessoaDAO pessoadao = new PessoaDAO();
		
		//adding
		pessoadao.AddPessoa(pessoa);
		System.out.println("Adding: " + pessoa.getNome());
		
		//changing
		pessoa.setNome("Jeremias-nome-updated");
		System.out.println("Renamed to: " + pessoa.getNome());
		pessoadao.UpdatePessoa(pessoa, pessoa.getCPF());
		
		//removing
		pessoadao.DelPessoa(pessoa);
	}
}