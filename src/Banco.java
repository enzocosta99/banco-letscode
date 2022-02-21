
import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas = new ArrayList<>();
		
	public Banco(String nome) {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\nBem vindo ao Banco " + nome + "!\n");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=\n");
	}
	
	public void abrirConta(Conta conta) {
		
		contas.add(conta);
        System.out.println("Conta aberta com sucesso!\n");
		
	}
	
}
