package bytebank.herdado;

//É uma classe abstrata, com todos os métodos abstratos.
//Não pode ter nada concreto, atributos ou métodos com implementação.

//contrato Autenticavel
	//quem assinar esse contrato precisa implementar os métodos
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autenticar(int senha);

}
