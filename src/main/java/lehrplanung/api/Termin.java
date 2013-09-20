package lehrplanung.api;

import java.sql.Date;
import java.sql.Time;

public interface Termin {
	Date getDatum();
	
	Time getStart();
	
	Time getEnde();
	
	Raum getRaum();
	
	int getAkademischeStunden();
}
