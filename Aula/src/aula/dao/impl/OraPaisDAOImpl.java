/**
 * 
 */
package aula.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import aula.Pais;
import aula.dao.PaisDAO;

/**
 * @author 43419971
 *
 */
public class OraPaisDAOImpl implements PaisDAO {
	private PreparedStatement stmtList;
	private PreparedStatement stmtFind;
	private PreparedStatement stmtInsert;
	private PreparedStatement stmtUpdate;
	private PreparedStatement stmtDelete;

	public OraPaisDAOImpl(Connection conn) {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM Pais");
		try {
			stmtList = conn.prepareStatement(sb.toString());
			sb.append(" WHERE Pais_ID = ?");
			stmtFind = conn.prepareStatement(sb.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see aula.dao.PaisDAO#list()
	 */
	@Override
	public ArrayList<Pais> list() {
		ArrayList<Pais> list = new ArrayList<Pais>();
		try {
			ResultSet rs = stmtList.executeQuery();
			while (rs.next()){
				Pais p = new Pais();
				p.setId(rs.getInt(1));
				p.setNome(rs.getString(2));
				list.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * @see aula.dao.PaisDAO#get(int)
	 */
	@Override
	public Pais get(int id) {
		try {
			stmtFind.setInt(1, id);
			ResultSet rs = stmtFind.executeQuery();
			if (rs.next()){
				Pais p = new Pais();
				p.setId(rs.getInt(1));
				p.setNome(rs.getString(2));
				return p;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @see aula.dao.PaisDAO#save(aula.Pais)
	 */
	@Override
	public int save(Pais pais) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see aula.dao.PaisDAO#delete(aula.Pais)
	 */
	@Override
	public int delete(Pais pais) {
		// TODO Auto-generated method stub
		return 0;
	}

}
