package reutilizcao.animais;

public class Gato extends Animal {
	public Gato(String nome, String raca) {
		super(nome, raca);
	}

	public String caminha() {
		return super.getNome() + " está saltando.";
	}
	
	public String comunica() {
		return "miau miau";
	}
}
