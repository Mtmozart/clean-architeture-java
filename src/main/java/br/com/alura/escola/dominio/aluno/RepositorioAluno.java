package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface RepositorioAluno {
		
	void matricular(Aluno aluno);
	
	Aluno buscarAlunoPorCpf(CPF cpf);
	
	List<Aluno> listarTodosOsAlunosListados();

}
