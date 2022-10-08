package dol;

import java.util.UUID;

public class Asignature {

	private String ID;
	private String asigName;
	public Asignature() {
		super();
	}
	public Asignature(String iD, String asigName) {
		super();
		ID = iD;
		this.asigName = asigName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String rIS) {
		ID = rIS;
	}
	public String getAsigName() {
		return asigName;
	}
	public void setAsigName(String asigName) {
		this.asigName = asigName;
	}
	
	public void show() {
		System.out.printf("Id = %s \nNombre = %s", getID(), getAsigName());
	}
	
	
}
