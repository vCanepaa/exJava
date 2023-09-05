package abstratas;

public class PessoaJuridica extends Pessoa{
	private int nFuncionarios;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, int nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	public Double calcImposto() {
		double impostos = this.rendaAnual * 0.16;
		if(this.nFuncionarios > 10) {
			impostos = this.rendaAnual * 0.14;
		}
		return impostos;
	}
}
