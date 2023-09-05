package abstratas;

public abstract class Pessoa {
	protected String nome;
	protected Double rendaAnual;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double calcImposto();
	
	public String impostosPagos() {
		return this.nome + ": $ "+ this.calcImposto();
	}
	public String getNome() {
		return this.nome;
	}
}
