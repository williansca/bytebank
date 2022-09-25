package bytebank.herdado;


public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//public for extended classes
	//protected double salario;

	//construtor vazio
	public Funcionario() {

	}

	public double getBonificacao() {
		return this.salario * 0.05;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

}
