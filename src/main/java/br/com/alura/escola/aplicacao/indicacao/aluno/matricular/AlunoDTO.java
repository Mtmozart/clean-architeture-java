package br.com.alura.escola.aplicacao.indicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

public class AlunoDTO {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;

	
	
	
	public AlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}




	public Aluno criarAluno() {
		return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
	}

}
