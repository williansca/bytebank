package bytebank.herdado;


public class Designer extends Funcionario{

	// SOBRESCRITA de metodo
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificação do designer");
		return 200;
	}

}
