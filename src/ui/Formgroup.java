package ui;

import java.util.Scanner;
import java.util.UUID;

import dol.Groups;

public class Formgroup {
	
	Groups g = new Groups();
	Scanner entry = new Scanner(System.in);
	public Groups groups() {
		UUID Id = UUID.randomUUID();
		String rIS = Id.toString();
			g.setID(rIS);
			System.out.println("Nombre del grupo");
			g.setGroupName(entry.next());
			System.out.println("Escoga una de las lista de los Estudiantes");
			
			
		return g;
		
	}
	

}
