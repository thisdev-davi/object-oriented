package reutilizacao.eletrodomestico;

public class MaquinaDeLavar extends Eletrodomestico{
	private int opcaoDeLavagem;
	
	public MaquinaDeLavar(int voltagem, int opcaoDeLavagem) {
		super(voltagem);
		this.opcaoDeLavagem = opcaoDeLavagem;
	}

	public int getOpcaoDeLavagem() {
		return opcaoDeLavagem;
	}


	public void setOpcaoDeLavagem(int opcaoDeLavagem) {
		this.opcaoDeLavagem = opcaoDeLavagem;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		this.opcaoDeLavagem = 1;
	}

	@Override
	public void desligar() {
		this.opcaoDeLavagem = 0;
		this.setLigado(false);
	}	
}
