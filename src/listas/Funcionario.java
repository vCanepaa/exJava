package listas;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id,String nome, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void Aumento(double porc) {
		this.salario += salario * (porc/100);
		System.out.println("Salario aumentado");
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
