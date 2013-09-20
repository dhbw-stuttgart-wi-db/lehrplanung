package lehrplanung.api;

public interface Lehrveranstaltung {
	String getKurzbezeichnung();

	String getName();

	void setName(String neuerName) throws Exception;

	int getPrasenzstunden();

	void setPrasenzstunden(int stunden) throws Exception;

	String getBeschreibung();

	void setBeschreibung(String neueBeschreibung) throws Exception;

}
