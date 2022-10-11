package main;

import model.ContadorDePessoas;

public class MainGincana {
	
	public static void main(String[] args) {
		ContadorDePessoas contadorDePessoas = new ContadorDePessoas(50);
		contadorDePessoas.registraEntrada(30);
		contadorDePessoas.registraSaida(20);
		System.out.println(contadorDePessoas.mostrarRelatorio());
	}
}
