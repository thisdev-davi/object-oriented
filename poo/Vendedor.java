package poo;

public class Vendedor {
	private String nome;
	private Categoria categoria;
	private static double salarioBase = 2.000;
	private int tempoServico;
	private double totalVendas;
	
	public Vendedor(String nome, int tempoServico, double totalVendas) {
		this.nome = nome;
		this.tempoServico = tempoServico;
		this.totalVendas = totalVendas;
		setCategoria();
		
	}
	
	public static double getSalarioBase() {
		return salarioBase;
	}
	
	public static void setSalarioBase(double salarioBase) {
		Vendedor.salarioBase = salarioBase;
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
	
	public double getTotalVendas() {
		return totalVendas;
	}
	
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if(this.tempoServico > 60) {
			this.categoria = Categoria.A;
		}
		
		if(this.tempoServico < 30) {
			this.categoria = Categoria.C;
		}
		
		this.categoria = Categoria.B;
	}
	
	public double comissao(){
		if(this.totalVendas > 20.000) {
			return this.totalVendas * 0.2;
		}
		if(this.totalVendas < 10.000) {
			return this.totalVendas * 0.05;
		}
		
		return this.totalVendas * 0.15;
	}
	
	public double gratificacao(){
		if(this.categoria == Categoria.A) {
			return Vendedor.salarioBase*0.15;
		}
		if(this.categoria == Categoria.B) {
			return Vendedor.salarioBase*0.075;
		}
		return 0;
		
	}
	
	public double salario() {
		return Vendedor.salarioBase+comissao()+gratificacao();
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Categoria: " + categoria + ", TempoServico: " + tempoServico
				+ ", Total de Vendas: " + totalVendas;
	} 
}
