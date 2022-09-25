package bytebank.conta;


public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta Saldo: R$" + primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta Saldo: R$" + primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Segunda conta Saldo: R$" + segundaConta.saldo);

		// when java creates an objects the default value for int is 0 unless specified
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		if (primeiraConta == segundaConta) {
			System.out.println("mesmas contas");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
