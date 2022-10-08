package ui;

import java.util.Scanner;

public class Menu {

	Scanner entry = new Scanner(System.in);
	mAsig A = new mAsig();
	public void Options() {
		System.out.println("1.Asignaturas \n2.Grupos \n3.Profesores \n4.Estudiantes \n5.Salir \nPor favor seleccione una opcion.");
	}
	
	public void mMenu() {
		short op = 0;
		boolean error = false;
		do {
			Options();
			op = entry.nextShort();
			switch(op) {
		
		case 1: 
			A.mAsi();
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			System.exit(0);
			break;
			
			default:
				
				break;
		
		}
		}while(op != 5);
		
	}
}
