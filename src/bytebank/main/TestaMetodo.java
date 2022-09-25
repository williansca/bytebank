package bytebank.main;



public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

		// contaDoPaulo.saca(50);
		boolean conseguiuSacar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuSacar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(100, contaDoPaulo)) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}

		System.out.println("Saldo conta Marcela " + contaDaMarcela.saldo);
		System.out.println("Saldo conta Paulo " + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
