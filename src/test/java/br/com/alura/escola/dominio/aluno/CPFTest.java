package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoDeveriaCriaAInstanciaCPFComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new CPF(null)
				);
		assertThrows(IllegalArgumentException.class,
				() -> new CPF("")
				);
		assertThrows(IllegalArgumentException.class,
				() -> new CPF("INVALIDO")
				);
	}
	
	@Test
	void DeveriaCriarcpfComCaractereValidos() {
		String dados = "000.111.222-33";
		CPF cpf = new CPF(dados);
		assertEquals(dados, cpf.getCpf());
				
	}
	

}
