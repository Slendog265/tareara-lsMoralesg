package dol;

import java.util.List;
import java.util.UUID;

import ui.Menu;

public class Professor extends Person {

	private String Prof;
	private String yearsOfExp;
	private String defAsign;
	private String defGroup;
	
	public Professor() {
		super();
	}

	public Professor(String fName, String sName, String fSName, String sSName, UUID iD, String prof, String yearsOfExp,
			String defAsign, String Defgroup) {
		super(fName, sName, fSName, sSName, iD);
		Prof = prof;
		this.yearsOfExp = yearsOfExp;
		this.defAsign = defAsign;
		this.defGroup = Defgroup;
	}

	public String getProf() {
		return Prof;
	}

	public void setProf(String prof) {
		Prof = prof;
	}

	public String getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(String yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	public String getDefAsign() {
		return defAsign;
	}

	public void setDefAsign(String defAsign) {
		this.defAsign = defAsign;
	}

	public String getDefGroup() {
		return defGroup;
	}

	public void setDefGroup(String defGroup) {
		this.defGroup = defGroup;
	}


	
	
	
	
	
}
