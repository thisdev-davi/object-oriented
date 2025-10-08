package reutilizcao.animais;

public class Cachorro extends Animal{
	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	
	@Override
	public String caminha() {
		return super.getNome() + " está correndo";
	}
	
	@Override
	public String comunica() {
		return "au au";
	}
}
