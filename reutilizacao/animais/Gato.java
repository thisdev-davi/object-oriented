package reutilizcao.animais;

public class Gato extends Animal {
	public Gato(String nome, String raca) {
		super(nome, raca);
	}

	// metodo abstrato
	@Override
	public String caminha() {
		return super.getNome() + " está saltando.";
	}
	
	@Override
	public String comunica() {
		return "miau miau";
	}
}
