package lehrplanung.api;

import java.util.Collection;

public interface Studiengang {
	String getKurzbezeichnung();

	String getName();

	void setName(String neuerName) throws Exception;

	Collection<Studienrichtung> getStudienrichtungen() throws Exception;
}
