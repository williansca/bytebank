package bytebank.herdado;

public class Gerente extends FuncionarioAutenticavel {

	// SOBRESCRITA de metodo
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificação do gerente");
		// super means it comes from mother/super class
		return super.getSalario();
	}

}
