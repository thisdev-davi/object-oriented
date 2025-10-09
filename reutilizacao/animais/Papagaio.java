package reutilizcao.animais;

public class Papagaio extends Animal {
	public Papagaio(String nome, String raca) {
		super(nome, raca);
	}
	
	@Override
	public String caminha() {
		return super.getNome() + " está voando.";
	}
	
	@Override
	public String comunica() {
		return "loro loro";
	}
}
