package bytebank.herdadoconta;

public class ContaPoupanca extends Conta {

	// construtores não são herdados da super classe
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.setsaldo(super.getSaldo() + valor);
	}

}
