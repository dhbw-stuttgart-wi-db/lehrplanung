package lehrplanung.api;

import java.util.Collection;

public interface Module {
	String getKurzbezeichnung();

	String getName();

	void setName(String neuerName) throws Exception;

	int getECTS();

	void setECTS(int neueEcts) throws Exception;

	String getBeschreibung();

	void setBeschreibung(String neueBeschreibung) throws Exception;

	Collection<Lehrveranstaltung> getLehrveranstaltungen() throws Exception;

}
