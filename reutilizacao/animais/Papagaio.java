package reutilizcao.animais;

public class Papagaio extends Animal {
	public Papagaio(String nome, String raca) {
		super(nome, raca);
	}
	
	public String caminha() {
		return super.getNome() + " está voando.";
	}
	
	public String comunica() {
		return "loro loro";
	}
}
