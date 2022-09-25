package bytebank.herdado;


public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	// SOBRESCRITA de metodo
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificação do gerente");
		// super means it comes from mother/super class
		return super.getBonificacao() + super.getSalario();
	}

}
