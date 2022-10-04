package main;

import model.Horario;

public class Main01Horario {
	public static void main (String [] args) {
		Horario horario = new Horario(4);
		
		System.out.println(horario.getHora() + ":" + horario.getMinuto());
		
		horario.setHora(12);
		horario.setMinuto(30);
		
		System.out.println(horario.toString());
	}
}
