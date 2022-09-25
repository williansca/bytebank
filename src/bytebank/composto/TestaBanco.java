package bytebank.composto;


public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Vieira";
		paulo.cpf = "111.111.111-11";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		// associa o cliente paulo a contaDoPaulo
		contaDoPaulo.cliente = paulo;
		System.out.println(contaDoPaulo.cliente.nome);
	}

}
