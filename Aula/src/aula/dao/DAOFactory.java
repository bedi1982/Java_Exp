/**
 * 
 */
package aula.dao;

public interface DAOFactory {
	
	PaisDAO getPaisDAO();
	ConfigDAO getConfigDAO();

	void commit();
	void rollback();
	void close();
}
