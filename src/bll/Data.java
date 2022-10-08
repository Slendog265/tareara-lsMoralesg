package bll;

import dol.Asignature;
import dol.MList;
import ui.FormAsig;

public final class Data {

	public static MList L = new MList();
	
	public static void addAsig(Asignature a ) {
		L.addAsig(a);
	} 
	public static void catchAsig() {
		FormAsig Fa = new FormAsig();
		addAsig(Fa.Asig());
		
	}
	
	public static void addgroups() {
	L.addgroups(g);
	}
	
	public static void catchgroups() {
		
	}
	
	public static void addpro() {
		
	}
	
	public static void catchpro() {
		
	}
	public static void addStud() {
		
	}
	
	public static void catchStud() {
		
	}
	
	
		
	
	
	
}


