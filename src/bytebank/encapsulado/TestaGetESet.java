package bytebank.encapsulado;


public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(0004);
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		//conta.cliente = paulo;
		
		paulo.setNome("Paulo Silveira");
		
		conta.setCliente(paulo);
		System.out.println(conta.getCliente().getNome());
		
		// em 1 linha
		conta.getCliente().setProfissao("Programador");
		conta.getCliente().setCpf("999.999.999-99");
		
		// em 2 linhas
		Cliente clienteDaConta = conta.getCliente();
		clienteDaConta.setProfissao("programador");
		
		System.out.println(conta.getCliente().getProfissao());
		System.out.println(conta.getCliente().getCpf());
		
		System.out.println(conta.getSaldo());
		System.out.println(conta.getCliente().getNome());
		
		System.out.println(clienteDaConta);
		System.out.println(paulo);
		System.out.println(conta.getCliente());
		
	}
}
