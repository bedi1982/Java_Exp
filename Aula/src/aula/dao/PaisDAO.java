package aula.dao;

import java.util.ArrayList;

import aula.Pais;

public interface PaisDAO {

	ArrayList<Pais> list();
	Pais get(int id);

	int save(Pais pais);

	int delete(Pais pais);
}
