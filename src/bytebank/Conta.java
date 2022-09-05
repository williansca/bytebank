package bytebank;

//composicao de objetos
public class Conta {

	double saldo;

	int agencia;

	int numero;

	String titular;

	public void deposita(double valor) {
		// this to the acc that invoked the method
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			//valor += destino.saldo;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

}
