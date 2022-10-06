package bytebank.herdado;


public class TestGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();

		//herança da classe Funcionario
		g1.setNome("Marco");
		g1.setCpf("222.222.222.22");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(2222);
		boolean autenticou = g1.autenticar(2222);
		System.out.println(autenticou);
		//System.out.println("Senha escolhida: " + g1.getSenha());
		
		System.out.println(g1.getBonificacao());

	}

}
