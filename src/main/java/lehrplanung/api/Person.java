package lehrplanung.api;

public interface Person {
	int getPersonennummer();

	String getVorname();

	void setVorname(String vorname) throws Exception;

	String getNachname();

	void setNachname(String nachname) throws Exception;

	String getTitel();

	void setTitel(String titel) throws Exception;

	String getEMail();

	void setEMail(String email) throws Exception;

	String getArbeitgeber();

	void setArbeitgeber(String arbeitgeber) throws Exception;

}
