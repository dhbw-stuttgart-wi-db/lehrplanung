package lehrplanung.api;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;

public interface Semester {
	int getSemester();

	Collection<LehrveranstaltungKursSemester> getLehrveranstaltungenFuerKurs() throws Exception;

	LehrveranstaltungKursSemester erstelleLehrveranstaltungFuerKurs(Lehrveranstaltung lehrveranstaltung)
			throws Exception;

	void loescheLehrveranstaltung(LehrveranstaltungKursSemester lehrveranstaltung) throws Exception;

	Collection<Termin> getTermine() throws Exception;

	Termin ergaenzeTermin(Date datum, Time start, Time Ende) throws Exception;

	void loesche(Termin termin) throws Exception;
	
}
