package bytebank.herdado;

//não pode instanciar essa classe, pq é abstract
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// public for extended classes
	// protected double salario;

	// construtor vazio
//	public Funcionario() {
//
//	}

	// abstract método não tem corpo, não há implementação, obriga subclasses a ter metodo
	public abstract double getBonificacao();

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
