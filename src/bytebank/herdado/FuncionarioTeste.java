package bytebank.herdado;


public class FuncionarioTeste {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionario comum; 1 - Gerente; 2 - Diretor

	//construtor vazio
	public FuncionarioTeste() {

	}

	public double getBonificacao() {
		
		if(this.tipo == 0) { //Funcionario comum;
			return this.salario * 0.1;
		} else if(this.tipo == 1) { // gerente
			return this.salario;
		} else { //diretor
			return this.salario + 1000.0;
		}
		
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
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
