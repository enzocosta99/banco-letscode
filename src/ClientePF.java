
public class ClientePF extends Cliente{
	private String cpf;

	public ClientePF(String nome, String cpf) {
		super.setNome(nome);
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
