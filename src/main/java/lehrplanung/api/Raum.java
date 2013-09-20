package lehrplanung.api;

public interface Raum {
	String getGebaeude();

	void setGebaeude(String gebaeude) throws Exception;

	String getRaumnummer();

	void setRaumnummer(int raumnummer) throws Exception;

	int getSitzplaetzeVorlesung();

	int getSitzplaetzeKlausur();

	void setSitzplaetzeVorlesung(int plaetze) throws Exception;

	void setSitzplaetzeKlausur(int plaetze) throws Exception;

}
