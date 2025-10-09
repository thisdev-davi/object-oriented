package reutilizacao.eletrodomestico;

public class TV extends Eletrodomestico{
	int canal, volume, tamanho;
	public TV(int voltagem, int canal, int volume, int tamanho) {
		super(voltagem);
		this.canal = canal;
		this.voltagem = volume;
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}


	public void setCanal(int canal) {
		this.canal = canal;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		this.canal = 1;
		this.volume = 10;
	}
	
	@Override
	public void desligar() {
		this.canal = 0;
		this.volume = 0;
		this.setLigado(false);
	}
}
