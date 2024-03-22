package escola;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	
	
	public Telefone(String ddd, String numero) {
		//validação desafio e depois fazer o teste de unidade do telefone.
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
	
	

}
