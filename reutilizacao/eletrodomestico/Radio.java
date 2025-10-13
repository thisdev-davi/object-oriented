package reutilizacao.eletrodomestico;

public class Radio extends Eletrodomestico{
	private int banda, volume;
	private float sintonia;
	
	public int getBanda() {
		return banda;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public float getSintonia() {
		return sintonia;
	}

	public void setSintonia(float sintonia) {
		this.sintonia = sintonia;
	}

	public int getAM() {
		return AM;
	}

	public int getFM() {
		return FM;
	}

	private final int AM = 1;
	private final int FM = 1;
	
	
	public Radio(int voltagem, int banda, int volume, float sintonia) {
		super(voltagem);
		this.banda = banda;
		this.volume = volume;
		this.sintonia = sintonia;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		this.banda = FM;
		this.sintonia = 88.1f;
		this.volume = 10;
	}

	@Override
	public void desligar() {
		this.volume = 0;
		this.sintonia = 0;
		this.setLigado(false);
	}
}
