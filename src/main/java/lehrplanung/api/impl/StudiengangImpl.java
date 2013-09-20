package lehrplanung.api.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import jdbc.JdbcAccess;
import lehrplanung.api.Studiengang;
import lehrplanung.api.Studienrichtung;

public class StudiengangImpl implements Studiengang {

	private String kurzbezeichnung;

	private String name;

	private final PreparedStatement updateNameStatement;

	private final PreparedStatement getStudienrichtungStatement;

	public StudiengangImpl(JdbcAccess db, ResultSet resultSetRow) throws SQLException {
		super();

		this.kurzbezeichnung = resultSetRow.getString("Kurzbezeichnung");
		this.name = resultSetRow.getString("name");

		this.updateNameStatement = db.getConnection().prepareStatement(
				"UPDATE Studiengang SET Name = ? WHERE Kurzbezeichnung = ?");
		updateNameStatement.setString(2, kurzbezeichnung);

		this.getStudienrichtungStatement = db.getConnection().prepareStatement(
				"GET Studiengang, Kurzbezeichnung, Name FROM Studienrichtung WHERE Studiengang = ?");
		getStudienrichtungStatement.setString(1, kurzbezeichnung);

	}

	@Override
	public String getKurzbezeichnung() {
		return this.kurzbezeichnung;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String neuerName) throws Exception {
		this.name = neuerName;

		updateNameStatement.setString(1, neuerName);
		int affectedRows = updateNameStatement.executeUpdate();
		if (affectedRows != 1)
			throw new Exception("Update failed, expected 1 affected row but got " + affectedRows);
	}

	@Override
	public Collection<Studienrichtung> getStudienrichtungen() throws Exception {
		Collection<Studienrichtung> result = new LinkedList<>();

		ResultSet resultSet = getStudienrichtungStatement.executeQuery();
		while (resultSet.next()) {
			result.add(new StudienrichtungImpl(resultSet));
		}
		resultSet.close();

		return result;
	}

}
