package entities;

public class Pessoa {
public String nome;

public Pessoa(String nome) {
	this.nome = nome;
}

public String saudar() {
	return "Olá, meu nome é " + nome;
}

}
