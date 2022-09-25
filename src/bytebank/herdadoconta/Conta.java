package bytebank.herdadoconta;


//composicao de objetos
public class Conta {

	private double saldo;

	private int agencia;

	private int numero;

	private Cliente cliente;

	// static é da classe e nao do objeto, atributo compartilhado por todos objts
	private static int total = 0;

//	public Conta() {
//
//	}

	public Conta(int agencia, int numero) {
		Conta.total++;

		this.numero = numero;
		this.agencia = agencia;
		System.out.println("estou criando uma conta " + this.numero);
		System.out.println("o total de contas e " + Conta.total);
	}

	public void deposita(double valor) {
		// this to the acc that invoked the method
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		System.out.println("Valor informado inválido.");
		return false;

	}

	public boolean transfere(double valor, Conta destino) {

		if (this.sacar(valor)) {
			// valor += destino.saldo;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor ou igual a 0.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode agencia menor ou igual a 0.");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// metodos static só acessa atributos static
	public static int getTotal() {
		return Conta.total;
	}

}
