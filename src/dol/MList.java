package dol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MList {
	
	private List<Asignature> Asig;
	private List<Groups> groups;
	private List<Professor> Pro;
	private List<Student> Stud;
	private Scanner entry = new Scanner(System.in);
	
	public MList() {
		Asig = new ArrayList<Asignature>();
		groups = new ArrayList<Groups>();
		Pro = new ArrayList<Professor>();
		Stud = new ArrayList<Student>();
		
		
	}

	public MList(List<Asignature> asig, List<Groups> groups, List<Professor> pro, List<Student> stud) {
		super();
		Asig = asig;
		this.groups = groups;
		Pro = pro;
		Stud = stud;
	}

	public List<Asignature> getAsig() {
		return Asig;
	}

	public void setAsig(List<Asignature> asig) {
		Asig = asig;
	}

	public List<Groups> getGroups() {
		return groups;
	}

	public void setGroups(List<Groups> groups) {
		this.groups = groups;
	}

	public List<Professor> getPro() {
		return Pro;
	}

	public void setPro(List<Professor> pro) {
		Pro = pro;
	}

	public List<Student> getStud() {
		return Stud;
	}

	public void setStud(List<Student> stud) {
		Stud = stud;
	}
	
	public void addAsig (Asignature a) {
		this.Asig.add(a);
	}
	
    public void addgroups () {
		
	}

    public void addpro () {
		
	}
    
    public void addStud () {
		
	}
    
    public void showData() {
		for(int i=0; i<Asig.size();i++) {
			Asig.get(i).show();
	 
	    
		}
	}
    
    public void Selec() {
    	
    	System.out.println("Seleccione una asignatura");
    	Short opc;
    	opc = entry.nextShort();
    	switch(opc) {
    	case 1:
    		Asig.get(0);
        	break;
    	case 2:
        	Asig.get(1);
        	break;
    	case 3: 
        	Asig.get(2);
        	break;
        	default:
        		break;
        	
        	
    	}
    	
    }
    
public void Selec1() {
    	
    	System.out.println("Seleccione una asignatura");
    	Short opc;
    	opc = entry.nextShort();
    	switch(opc) {
    	case 1:
    		Stud.get(0);
        	break;
    	case 2:
        	Stud.get(1);
        	break;
    	case 3: 
        	Stud.get(2);
        	break;
        	default:
        		break;
        	
        	
    	}
    	
    }
}
