package herancaex;

public class Funcionario {
	protected int horas;
	protected double valorPorHora;
	protected String nome;
	
	public Funcionario() {
		
	}
	public Funcionario(String n, int horas, double v) {
		this.nome = n;
		this.horas = horas;
		this.valorPorHora =v;
	}
	public double Pagamento() {
		return horas * valorPorHora;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return this.nome + "$"+ this.Pagamento();
	}
	
}
