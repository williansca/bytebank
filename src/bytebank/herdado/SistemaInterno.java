package bytebank.herdado;

//sistema interno é acessivel só por alguns tipos de funcionarios da empresa e clientes
public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autenticar(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
	}

}
