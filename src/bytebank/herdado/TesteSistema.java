package bytebank.herdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador ad = new Administrador();
		ad.setSenha(2222);
		
		Cliente cli = new Cliente();
		cli.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(ad);
		si.autentica(cli);
		
	}

}
