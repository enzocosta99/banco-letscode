
public abstract class Conta {
	private Cliente titular;
	protected double saldo;	
	
	public Conta(Cliente titular, double saldo) {
		this.saldo = saldo;
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void sacar(double valor) {
		if (this.getSaldo() >= valor) {
			if (this.titular instanceof ClientePJ) {
				this.saldo -= valor + ((valor / 100) * 0.5);
			} else {
				this.saldo -= valor;
				System.out.println("Saque de R$" + valor + " Realizado com sucesso!");
			}
		} else {
			System.out.println("Impossível realizar o saque!");
		}
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.saldo += valor);
		System.out.println("R$" + valor + " depositados com sucesso!");
	}
	
	public void transferir(Conta conta, double valor) {
		if (this.saldo >= valor) {
			if (this.titular instanceof ClientePJ) {
				this.saldo -= valor + ((valor / 100) * 0.5);
			}
			else {
				this.setSaldo(this.saldo -= valor);
				conta.saldo += valor;
			}
			System.out.println("R$" + valor + " transferidos para " 
			+ conta.getTitular().getNome() + " com sucesso!");
		} else {
			System.out.println("Impossível realizar transferência!");
		}
	}
	
	public double consultarSaldo() {
		return this.getSaldo();
	}
	
}
