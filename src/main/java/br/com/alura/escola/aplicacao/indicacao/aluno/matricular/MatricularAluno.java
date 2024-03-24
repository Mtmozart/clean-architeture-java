package br.com.alura.escola.aplicacao.indicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioAluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

public class MatricularAluno {
	
	private final RepositorioAluno repositorio;

	
	public MatricularAluno(RepositorioAluno repositorio) {
		this.repositorio = repositorio;
		
	}
	
	public void executa(AlunoDTO dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}
	

}
