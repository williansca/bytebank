package bytebank.herdado;


public class TestReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Joseph");
		g1.setSalario(5000.0);
		String nome = g1.getNome();
		System.out.println(nome);
		
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		
		System.out.println(controle.getSoma());

		// Funcionario g2 = new Gerente();
		// g2.setNome("Joao");
		// g2.autentica does not work cause g2 references points to funcionario
		// method autentica is on gerente class
	}

}
