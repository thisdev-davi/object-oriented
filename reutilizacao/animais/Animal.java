package reutilizcao.animais;

public abstract class Animal {
	private String nome, raca;
	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public abstract String caminha();
	public abstract String comunica();
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Raca:" + raca;
	}
}
