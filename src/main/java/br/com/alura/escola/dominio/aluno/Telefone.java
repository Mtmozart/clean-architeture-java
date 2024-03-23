package br.com.alura.escola.dominio.aluno;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	
	
	public Telefone(String ddd, String numero) {
		//validação desafio e depois fazer o teste de unidade do telefone.
		
		if(ddd == null || numero == null || !ddd.matches("\\d{2}") || !numero.matches("\\d{5}-\\d{4}")){
			throw new IllegalArgumentException("Número inválido!");
		}
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
