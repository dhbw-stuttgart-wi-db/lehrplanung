package lehrplanung.api.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Collection;
import java.util.LinkedList;

import jdbc.JdbcAccess;
import lehrplanung.api.Kurs;
import lehrplanung.api.Lehrplanung;
import lehrplanung.api.Person;
import lehrplanung.api.Raum;
import lehrplanung.api.Studiengang;

public class LehrplanungImpl implements Lehrplanung {
	private JdbcAccess db;

	public LehrplanungImpl(JdbcAccess db) {
		super();
		this.db = db;
	}

	@Override
	public Collection<Studiengang> getStudiengaenge() throws Exception {
		Collection<Studiengang> result = new LinkedList<>();

		ResultSet resultSet = db.executeQueryStatement("SELECT Kurzbezeichnung, Name FROM Studiengang");
		while (resultSet.next()) {
			result.add(new StudiengangImpl(db, resultSet));
		}
		resultSet.close();

		return result;
	}

	@Override
	public Studiengang erstelleStudiengang(String kurzbezeichnung, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kurs getKurs(String kursname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kurs erstelleKurs(String kursname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Person> getPersonenNachNachname(String suchmuster) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Person> getPersonenNachArbeitgeber(String suchmuster) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<String> getGebäude() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Raum> getRaeume(String gebaeude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Raum erstelleRaum(String gebaeude, String raum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Raum> getFreienRaum(Date datum, Time von, Time bis) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
