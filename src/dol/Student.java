package dol;

import java.util.UUID;

public class Student extends Person{

	private String dateOfEntry;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fName, String sName, String fSName, String sSName, UUID iD, String dateOfEntry) {
		super(fName, sName, fSName, sSName, iD);
		this.dateOfEntry = dateOfEntry;
	}

	public String getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	
	
	
	
}
