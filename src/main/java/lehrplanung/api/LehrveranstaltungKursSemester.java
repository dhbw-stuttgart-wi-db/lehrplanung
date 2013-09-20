package lehrplanung.api;

import java.util.Collection;

public interface LehrveranstaltungKursSemester {
	Lehrveranstaltung getLehrveranstaltung() throws Exception;

	Person getDozent() throws Exception;

	void setDozent(Person dozent) throws Exception;

	Collection<Termin> getTermine() throws Exception;

	void addTermin(Termin termin) throws Exception;

	void entferneTermin(Termin termin) throws Exception;

	int getAnzahlAkademischeFuerGeplanteTermine() throws Exception;
}
