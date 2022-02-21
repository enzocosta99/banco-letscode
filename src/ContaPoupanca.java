
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular, double saldo) {
		super(titular, saldo);
		if (titular instanceof ClientePJ) {
			System.out.println("Imposs�vel abrir conta-investimento pois " 
			+ titular.getNome() + " � um cliente PJ!");
			super.saldo = 0;
			super.setTitular(null);
		}
	}

}
