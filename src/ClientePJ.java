
public class ClientePJ extends Cliente {
	private String cnpj;
	
	public ClientePJ(String nome, String cnpj) {
		this.setNome(nome);
		this.setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
