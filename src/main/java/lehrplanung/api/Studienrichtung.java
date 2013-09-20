package lehrplanung.api;

import java.util.Collection;

public interface Studienrichtung {
	String getKurzbezeichnung();

	String getName();

	void setName(String neuerName) throws Exception;

	Collection<Module> getModule() throws Exception;

}
