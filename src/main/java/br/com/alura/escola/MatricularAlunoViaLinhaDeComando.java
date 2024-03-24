package br.com.alura.escola;

import br.com.alura.escola.aplicacao.indicacao.aluno.matricular.AlunoDTO;
import br.com.alura.escola.aplicacao.indicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

public class MatricularAlunoViaLinhaDeComando {

	public static void main(String[] args) {

		String nome = "Fulano da Silva";
		String cpf ="123.456.789-00";
		String email = "fulano@email.com";
	
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosMemoria()	);
		matricular.executa(new AlunoDTO(nome, cpf, email));
		
	}

}
