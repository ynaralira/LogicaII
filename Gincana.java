package model;

public class Gincana {

	public int qtdetotal;
	public Equipe equipe1;
	public Equipe equipe2;
	public Equipe equipe3;

	public void imprimir() {
		somarPontuacao();
		System.out.println(toString());
	}

	public String toString() {
		return "Quantidade total de pontos da gincana: " + qtdetotal;

	}

	public void somarPontuacao() {
		qtdetotal = equipe1.qtdepontos + equipe2.qtdepontos + equipe3.qtdepontos;
		
	}
}
