package reutilizacao.automoveis;

public class AutomovelBasico extends Automovel {
	private boolean retrevisorDoPassageiro, limpadorTraseiro, radioFm;
	public AutomovelBasico(String modelo, String cor, int combustivel, 
				boolean retrovisor, boolean limpador, boolean radio) {
		super(modelo, cor, combustivel);
		this.retrevisorDoPassageiro = retrovisor;
		this.limpadorTraseiro = limpador;
		this.radioFm = radio;
	}
	
	
	public boolean isRetrevisorDoPassageiro() {
		return retrevisorDoPassageiro;
	}


	public void setRetrevisorDoPassageiro(boolean retrevisorDoPassageiro) {
		this.retrevisorDoPassageiro = retrevisorDoPassageiro;
	}


	public boolean isLimpadorTraseiro() {
		return limpadorTraseiro;
	}


	public void setLimpadorTraseiro(boolean limpadorTraseiro) {
		this.limpadorTraseiro = limpadorTraseiro;
	}


	public boolean isRadioFm() {
		return radioFm;
	}


	public void setRadioFm(boolean radioFm) {
		this.radioFm = radioFm;
	}

	@Override
	public double valor() {
		double aux = super.valor();
		if(this.retrevisorDoPassageiro) {
			aux += 1.250;
		}
		if(this.limpadorTraseiro) {
			aux += 2.500;
		}
		if(this.radioFm) {
			aux += 7.500;
		}
		return aux;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		if(this.retrevisorDoPassageiro) {
			aux += ". Tem retrovisor passageiro";
		}
		if(this.limpadorTraseiro) {
			aux += ". Tem limpador traseiro";
		}
		if(this.radioFm) {
			aux += ". Tem radio";
		}
		return aux;
	}
}
