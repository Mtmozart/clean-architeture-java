package br.com.alura.escola.aplicacao.indicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosMemoria repositorio = new RepositorioDeAlunosMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		AlunoDTO aluno = new AlunoDTO("Fulano", "123.456.789-00", "fulano@email.com");		
		useCase.executa(aluno);
		
		Aluno alunoEncontrado = repositorio.buscarAlunoPorCpf(new CPF( "123.456.789-00"));
		assertEquals("Fulano", alunoEncontrado.getNome());
		assertEquals("123.456.789-00", alunoEncontrado.getCpf());
		assertEquals("fulano@email.com", alunoEncontrado.getEmail());

		
		
	}

}
