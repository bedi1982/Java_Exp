/**
 * 
 */
package aula.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import aula.dao.ConfigDAO;
import aula.dao.DAOFactory;
import aula.dao.PaisDAO;

/**
 */
public class OraDAOFactory implements DAOFactory {
	private Connection conn;

	public OraDAOFactory() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@server:port";
			conn = DriverManager.getConnection(url, "ORA11", "abc123");
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see aula.dao.DAOFactory#getPaisDAO()
	 */
	@Override
	public PaisDAO getPaisDAO() {
		return new OraPaisDAOImpl(conn);
	}

	/**
	 * @see aula.dao.DAOFactory#getConfigDAO()
	 */
	@Override
	public ConfigDAO getConfigDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see aula.dao.DAOFactory#commit()
	 */
	@Override
	public void commit() {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see aula.dao.DAOFactory#rollback()
	 */
	@Override
	public void rollback() {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see aula.dao.DAOFactory#close()
	 */
	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
