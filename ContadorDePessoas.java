package testepacote;

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
		if(qtdePresentes + quantidade <= limitePessoas ){
			qtdePresentes += quantidade;
		}
	}
	
	public void registraSaida(int quantidade) {
		this.qtdeTotal = quantidade;
	}
	
	public void mostrarRelatorio() {
	}
}
