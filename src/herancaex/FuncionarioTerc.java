package herancaex;

public class FuncionarioTerc extends Funcionario{
	private double despesaAd;
	
	
	
	public FuncionarioTerc() {
		
	}
	public FuncionarioTerc(String n, int h, double v, double d) {
		super(n,h,v);
		this.despesaAd = d;
	}
	public double Pagamento() {
		double bonus = despesaAd * 1.1;
		return (this.horas * this.valorPorHora) + bonus;
		
	}
	public double getDespesaAd() {
		return despesaAd;
	}
	public void setDespesaAd(double despesaAd) {
		this.despesaAd = despesaAd;
	}
	
}
