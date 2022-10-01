package ui;

import java.util.UUID;

public class Person {
 
	private String FName;
	private String SName;
	private String fSName;
	private String sSName;
	private UUID ID;
	private String Gender;
	private String Age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String fName, String sName, String fSName, String sSName,  UUID iD) {
		super();
		FName = fName;
		SName = sName;
		this.fSName = fSName;
		this.sSName = sSName;
		ID = iD;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getfSName() {
		return fSName;
	}
	public void setfSName(String fSName) {
		this.fSName = fSName;
	}
	public String getsSName() {
		return sSName;
	}
	public void setsSName(String sSName) {
		this.sSName = sSName;
	}
	public UUID getID() {
		return ID;
	}
	public void setID(UUID iD) {
		ID = iD;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAge() {
		return Age;
	}
	
	
	
}
