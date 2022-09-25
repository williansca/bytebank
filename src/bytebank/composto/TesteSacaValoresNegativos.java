package bytebank.composto;


public class TesteSacaValoresNegativos {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		// System.out.println(conta.saldo);

		System.out.println(conta.getSaldo());

		/*
		 * PROIBIDO atributos privados ficam sem acesso por outra 
		 * classe somente por metodos 
		 * conta.saldo = conta.saldo -101; 
		 * System.out.println(conta.saldo);
		 */

	}

}
