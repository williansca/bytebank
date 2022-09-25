package bytebank.herdadoconta;


public class TestContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1111, 2222);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(3333, 4444);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("CC: " + String.format("%.2f", cc.getSaldo()));
		System.out.println("CP: " + String.format("%.2f", cp.getSaldo()));
	}
}
