package reutilizacao;

public class AutomovelDeLuxo extends AutomovelBasico{
	private boolean direcaoHidraulica, cambioAutomatico, vidroETravaEletrica;
	private static final int NUMMAXPRESTACOES = 36;
	
	public AutomovelDeLuxo(String modelo,  String cor, int combustivel,
			boolean retrovisor, boolean limpador, boolean radio,
			boolean direcao, boolean cambio, boolean vidro) {
		super(modelo, cor, combustivel, retrovisor, limpador, radio);
		this.direcaoHidraulica = direcao;
		this.cambioAutomatico = cambio;
		this.vidroETravaEletrica = vidro;
	}

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public boolean isVidroETravaEletrica() {
		return vidroETravaEletrica;
	}

	public void setVidroETravaEletrica(boolean vidroETravaEletrica) {
		this.vidroETravaEletrica = vidroETravaEletrica;
	}
	
	@Override
	public int getNumMaxPrestacoes() {
		return NUMMAXPRESTACOES;
	}
	
	@Override
	public double valor() {
		double aux = super.valor();
		if(this.direcaoHidraulica) {
			aux += 5.000;
		}
		if(this.cambioAutomatico) {
			aux += 8.000;
		}
		if(this.vidroETravaEletrica) {
			aux += 3.500;
		}
		return aux;
	}
	
	@Override
	public String toString() {
		String temp = super.toString();
		if (this.direcaoHidraulica) {
			temp += "\nTem Direcao Hidraulica";
	    }
	    if (this.cambioAutomatico) {
	    	temp += "\nTem Cambio Automatico";
	    }
	    if (this.vidroETravaEletrica) {
	    	temp += "\nTem Vidro e Trava Eletrica";
	    }
	    return temp;
	 }
}
