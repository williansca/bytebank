package bytebank.composto;


//composicao de objetos
public class Conta {

	private double saldo;

	int agencia;

	int numero;

	Cliente cliente;

	public void deposita(double valor) {
		// this to the acc that invoked the method
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saca(valor);
			// valor += destino.saldo;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
