package bytebank.conta;


public class TesteReferencia {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 600;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		/*segundaConta variable is pointing to the same object as primeiraConta variable
		 * so there is 2 variables but 1 object
		*/
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 1000;
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
