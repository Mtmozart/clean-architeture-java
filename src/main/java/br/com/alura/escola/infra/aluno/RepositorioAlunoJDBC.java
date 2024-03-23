package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioAluno;
import br.com.alura.escola.dominio.aluno.Telefone;

public class RepositorioAlunoJDBC implements RepositorioAluno{

	private final Connection connection;
	
	
	
	public RepositorioAlunoJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void matricular(Aluno aluno) {
		
		String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
		try {
		
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute();
			
			sql = "INSERT INTO TELEFONE VALUES (?, ?)";
			
			ps = connection.prepareStatement(sql);
			
			for(Telefone telefone : aluno.getTelefones()) {
					ps.setString(1, telefone.getDdd());
					ps.setString(2, telefone.getNumero());
					ps.execute();
			}
			
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	
		
	}

	@Override
	public Aluno buscarAlunoPorCpf(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosOsAlunosListados() {
		// TODO Auto-generated method stub
		return null;
	}

}
