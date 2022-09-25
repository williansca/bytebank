package bytebank.herdado;


public class TestFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico");
		nico.setCpf("111.111.111-11");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
