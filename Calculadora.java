package main;



import model.Calculadora;



public class Main01 {



	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		calculadora.valor1 = 5;

		calculadora.valor2 = 6;

		calculadora.valor3 = 7;

		

		System.out.println(calculadora.somar());

		System.out.println(calculadora.subtracao());

		System.out.println(calculadora.divisao());

		System.out.println(calculadora.multiplicacao());

	}

}



package model;



public class Calculadora {



	public double valor1;

	public double valor2;

	public double valor3;



	public Calculadora() {

	}

	public Calculadora(double valor1, double valor2, double valor3) {

		this.valor1 = valor1;

		this.valor2 = valor2;

		this.valor3 = valor3;

	}



	public double somar() {

		return valor1 + valor2 + valor3;

	}



	public double subtracao() {

		return valor1 + valor2 + valor3;

	}



	public double divisao() {

		return valor1 / valor2 / valor3;

	}



	public double multiplicacao() {

		return valor1 * valor2 * valor3;

	}

}

