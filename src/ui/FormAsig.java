package ui;

import java.util.Scanner;
import java.util.UUID;

import dol.Asignature;

public class FormAsig {

	Asignature a = new Asignature();
	Scanner entry = new Scanner(System.in);
	public Asignature Asig() {
	UUID Id = UUID.randomUUID();
	String rIS = Id.toString();
		a.setID(rIS);
		System.out.println("Nombre de la Asignatura");
		a.setAsigName(entry.next());
		return a;
	}
	
	
}
