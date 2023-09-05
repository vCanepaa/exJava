package abstratas;

public class PessoaFisica extends Pessoa{
	private Double gastosSaude;
	
	
	public PessoaFisica() {
		
	}


	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}


	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	public Double calcImposto() {
		double impostos = 0;
		if(this.rendaAnual < 20000.00) {
		    impostos = this.rendaAnual * 0.15;
		}else if(this.rendaAnual > 20000.00){
			impostos = this.rendaAnual * 0.25;
		}
		if(this.gastosSaude > 0.0) {
			impostos = impostos - (this.gastosSaude/2);  
		}
		return impostos;
	}

}
