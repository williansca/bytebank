package bytebank.herdadoconta;


public class ContaCorrente extends Conta{

	//construtores não são herdados da super classe
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacar(valorASacar);
	}

}
