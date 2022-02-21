
public class ContaInvestimento extends Conta {

	public ContaInvestimento(Cliente titular, double saldo) {
		super(titular, saldo);
	}

	public void investir(double valor) {
		if (this.getTitular() instanceof ClientePJ) {
			this.setSaldo(this.saldo += valor + (valor * 0.02));
		} else {
			this.setSaldo(this.saldo += valor);
		}
		System.out.println("Investimento de R$" + valor + " realizado com sucesso!");
	}
	
}
