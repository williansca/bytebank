package bytebank.composto;


public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.cliente = new Cliente();
		System.out.println(contaDaMarcela.cliente);
		
		contaDaMarcela.cliente.nome = "Marcela";
		System.out.println(contaDaMarcela.cliente.nome);
		
		contaDaMarcela.cliente.cpf = "333.333.333-33";

		
	}

}
