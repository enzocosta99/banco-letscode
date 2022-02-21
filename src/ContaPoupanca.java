
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular, double saldo) {
		super(titular, saldo);
		if (titular instanceof ClientePJ) {
			System.out.println("Impossível abrir conta-investimento pois " 
			+ titular.getNome() + " é um cliente PJ!");
			super.saldo = 0;
			super.setTitular(null);
		}
	}

}
