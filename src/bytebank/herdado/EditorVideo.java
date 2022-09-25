package bytebank.herdado;


public class EditorVideo extends Funcionario{

	// SOBRESCRITA de metodo
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificação do editor");
		// super means it comes from mother/super class
		return super.getBonificacao() + 100;
	}

}
