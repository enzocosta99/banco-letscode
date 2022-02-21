
public class Aplicacao {

	public static void main(String[] args) {
		
		Banco banco = new Banco("XPC");
		
		ClientePF enzo = new ClientePF("Enzo Costa", "43562359892");
		ClientePJ carrefour = new ClientePJ("Carrefour", "43671890870001");
		ClientePF paulo = new ClientePF("Paulo Silveira", "35560912763");
		ClientePJ savegnago = new ClientePJ("Savegnago", "40198902420001");
		
		ContaCorrente contaDoEnzo = new ContaCorrente(enzo, 10000);
		banco.abrirConta(contaDoEnzo);
		ContaCorrente contaDoCarrefour = new ContaCorrente(carrefour, 10000);
		banco.abrirConta(contaDoCarrefour);
		ContaPoupanca contaDoPaulo = new ContaPoupanca(paulo, 10000);
		banco.abrirConta(contaDoPaulo);
		ContaInvestimento contaDoSavegnago = new ContaInvestimento(savegnago, 10000);
		banco.abrirConta(contaDoSavegnago);
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		
		System.out.println("Saldo da conta do Enzo: R$" + contaDoEnzo.consultarSaldo());
		System.out.println("Saldo da conta do Carrefour: R$" + contaDoCarrefour.consultarSaldo());
		System.out.println("Saldo da conta do Paulo: R$" + contaDoPaulo.consultarSaldo());
		System.out.println("Saldo da conta do Savegnago: R$" + contaDoSavegnago.consultarSaldo());
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		
		contaDoCarrefour.transferir(contaDoEnzo, 1000);
		contaDoPaulo.depositar(300);
		contaDoEnzo.sacar(500);
		contaDoSavegnago.investir(400);
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		
		System.out.println("Saldo da conta do Enzo: R$" + contaDoEnzo.consultarSaldo());
		System.out.println("Saldo da conta do Carrefour: R$" + contaDoCarrefour.consultarSaldo());
		System.out.println("Saldo da conta do Paulo: R$" + contaDoPaulo.consultarSaldo());
		System.out.println("Saldo da conta do Savegnago: R$" + contaDoSavegnago.consultarSaldo());
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}
}
