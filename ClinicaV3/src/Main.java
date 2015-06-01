import java.sql.*;
import java.util.Date;

import com.bedi.ClinicaV3.Model.Pessoa;
import com.bedi.ClinicaV3.jdbc.ConnectionFactory;
import com.bedi.ClinicaV3.jdbc.PessoaDAO;


public class Main {

	public static void main(String[] args) throws SQLException {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lombarde");
		pessoa.setCPF(369811969);
		pessoa.setData(new java.sql.Date(new Date().getTime()));
		
		System.out.println("Data: " + pessoa.getData());
		
		PessoaDAO pessoadao = new PessoaDAO();
		pessoadao.AddPessoa(pessoa);
	}
}