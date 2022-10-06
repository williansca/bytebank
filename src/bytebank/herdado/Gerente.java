package bytebank.herdado;

//Gerente é um Funcionario e assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	//quando um Gerente for criado, um AutenticacaoUtil será criado
	// se fala que o Gerente tem um autenticador
	//com o construtor assim
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	// SOBRESCRITA de metodo
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificação do gerente");
		// super means it comes from mother/super class
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autenticar(int senha) {
		return this.autenticador.autenticar(senha);

	}

}
