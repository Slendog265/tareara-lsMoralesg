package ui;

import java.util.Scanner;

import bll.DShow;
import bll.Data;
import dol.MList;

public class mAsig {

	MList Ml = new MList();
	Scanner entry = new Scanner(System.in);
	public void Options() {
		System.out.println("1.Abrir");
		System.out.println("2.Agregar");
		System.out.println("3.Asignar docente");
		System.out.println("4.Volver");
	}
	
	public void mAsi() {
		
		short op;
		do {
			Options();
			op = entry.nextShort();
			switch(op) {
		
		case 1: 
			DShow.sdAsig();
			break;
			
		case 2:
			Data.catchAsig();
			break;
			
		case 3:
			Ml.Selec();
			break;
			
		case 4:
			Menu m = new Menu();
		m.mMenu();
			break;
			
			default:
				System.out.println("Opcion incorrecta, Porfavor escoga una de las opciones mostradas.");	
				break;
		
		}
		}while(op != 4);
		
		
	}
	
}
