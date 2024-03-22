package escola;

public class Email {
		//Value object --> não é uma entidade, apenas parâmetros de um objeto.
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || 
				!endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail invalido!");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	
	
	
}
