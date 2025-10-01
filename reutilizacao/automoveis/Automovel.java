package reutilizacao;

public class Automovel {
	private static final int NUME_MAX_PRESTACOES = 24;
	
	public static final int GASOLINA = 1;
	public static final int FLEX = 2;
	public static final int DIESEL= 3;
	public static final int GAS = 4;
	
	private String modelo, cor;
	private int combustivel;
	
	public Automovel(String modelo, String cor, int combustivel) {
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
	}
	
	public Automovel() {
		this.modelo = "";
		this.cor = "";
		// combustivel ja comeca com 0 por ser int
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeMaxPrestacoes() {
		return NUME_MAX_PRESTACOES;
	}
	
	@Override
	public String toString() {
		return "Modelo: " + modelo + ", Cor: " + cor + 
				", Tipo de Combustivel: " + tipoCombustivel();
	}
	
	public String tipoCombustivel() {
		switch(this.combustivel) {
		case GASOLINA:
			return "Gasolina";
		case FLEX:
			return "Flex";
		case DIESEL:
			return "Diesel";
		case GAS:
			return "Gas";
		}
		return "";
	}
	
	public double valor() {
		switch(this.combustivel) {
			case GASOLINA:
				return 70.000;
			case FLEX:
				return 80.000;
			case DIESEL:
				return 95.000;
			case GAS:
				return 90.000;
		}
		return 0;
	}
}
