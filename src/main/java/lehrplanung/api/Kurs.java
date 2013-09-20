package lehrplanung.api;

public interface Kurs {
	String getKursname() throws Exception;
	
	Person getStudiengangsleiter() throws Exception;
	
	void setzeStudiengangsleiter(Person studiengangsleiter) throws Exception;
	
	Semester getSemester(int semester) throws Exception;
	
	Semester erstelleSemester(int semester) throws Exception;
	
}
