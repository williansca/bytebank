package bytebank.encapsulado;


public class TestaValores {

	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);
		
		
		//System.out.println(conta.getAgencia());
		
		//conta.setAgencia(1232123);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 14277);
		Conta conta3 = new Conta(1337,11447);
		
		//invocando metodo static
		System.out.println("Total de contas: "+ Conta.getTotal());
		
		//conta está inconsistente
		conta.setNumero(-50);
		conta.setAgencia(-50);
		
		System.out.println(conta.getAgencia());
		
	
	}

}
