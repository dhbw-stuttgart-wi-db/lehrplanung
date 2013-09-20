package lehrplanung.api.impl;

import java.sql.ResultSet;
import java.util.Collection;

import lehrplanung.api.Module;
import lehrplanung.api.Studienrichtung;

public class StudienrichtungImpl implements Studienrichtung {

	public StudienrichtungImpl(ResultSet resultSet) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getKurzbezeichnung() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String neuerName) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Module> getModule() {
		// TODO Auto-generated method stub
		return null;
	}

}
