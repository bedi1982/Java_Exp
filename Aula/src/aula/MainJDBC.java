package aula;

import aula.dao.DAOFactory;
import aula.dao.impl.OraDAOFactory;

public class MainJDBC {

	public static void main(String[] args) {
		DAOFactory daoFactory = null;
		if (args[0].equalsIgnoreCase("oracle")){
			daoFactory = new OraDAOFactory();
		} else {
			if (args[0].equalsIgnoreCase("file")){
				//daoFactory = new FileDAOFactory();
			} else {
				//daoFactory = new HibernateDAOFactory();
			}
		}
		
		Pais br = daoFactory.getPaisDAO().get(6);
		if (br != null){
			System.out.println(br.getId() + " : " + br.getNome());
		} else {
			System.out.println("País não encontrado!!!");
		}
		for (Pais p:daoFactory.getPaisDAO().list()){
			System.out.println(p);
		}	
	}
}
