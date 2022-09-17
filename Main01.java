package main;

import model.Endereco;
import model.pessoa;

public class Main01 {

	public static void main(String[] args) {
		pessoa pessoa = new pessoa();
		pessoa.nome = "Ynara";
		pessoa.CPF = "076-0";
		pessoa.dataNascimento = "07/06/2002";
		
		pessoa.endereco = new Endereco();
		pessoa.endereco.logradouro = "SGAN";
		pessoa.endereco.CEP = "70000-00";
		pessoa.endereco.cidade = "Brasília";
		
		System.out.println(pessoa.nome + " - " + pessoa.endereco.cidade);
	}

}
