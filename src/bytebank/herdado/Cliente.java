package bytebank.herdado;

//class implements an interface

public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
