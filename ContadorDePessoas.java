package model;

public class ContadorDePessoas {
	private int limitePessoas;
	private int qtdePresentes;
	private int qtdeTotal;

	public ContadorDePessoas() {
	}

	public ContadorDePessoas(int limite) {
		this.limitePessoas = limite;
	}
	
	public void registraEntrada(int quantidade) {
		if(qtdePresentes + quantidade < limitePessoas ){
			qtdePresentes += quantidade;
			qtdeTotal += quantidade;
		}
	}
	
	public void registraSaida(int quantidade) {
		if((qtdePresentes - quantidade) > 0){
			qtdePresentes -= quantidade;
		}
	}
	
	public String mostrarRelatorio() {
		return "Quantidade presentes: " + qtdePresentes + "\nQuantidade que passaram pelo restaurante: " + qtdeTotal;
	}
	
}
