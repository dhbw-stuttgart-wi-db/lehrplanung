package lehrplanung.api;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;

public interface Lehrplanung {
	Collection<Studiengang> getStudiengaenge() throws Exception;

	Studiengang erstelleStudiengang(String kurzbezeichnung, String name) throws Exception;

	Kurs getKurs(String kursname) throws Exception;

	Kurs erstelleKurs(String kursname) throws Exception;

	Collection<Person> getPersonenNachNachname(String suchmuster) throws Exception;

	Collection<Person> getPersonenNachArbeitgeber(String suchmuster) throws Exception;

	Collection<String> getGebäude() throws Exception;

	Collection<Raum> getRaeume(String gebaeude) throws Exception;

	Raum erstelleRaum(String gebaeude, String raum) throws Exception;

	Collection<Raum> getFreienRaum(Date datum, Time von, Time bis) throws Exception;
	
}
