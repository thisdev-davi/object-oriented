package reutilizacao.eletrodomestico;

public abstract class Eletrodomestico {
	boolean ligado;
	int voltagem;
	
	public Eletrodomestico(int voltagem) {
		this.voltagem = voltagem;
		this.ligado = false;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public abstract void ligar();
	public abstract void desligar();
}
