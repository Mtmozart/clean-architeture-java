package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDeNumeroInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone(null, null)
				);
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("invalido", "invalido")
				);
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("invalido", "99999-9999")
				);
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("69", "invalido")
				);
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("69", "null")
				);
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone(null, "99999-9999")
				);
	}
	
	@Test
	void deveriaCriarTelefoneComDDDeNumeroValidos() {
		String ddd = "69";
		String numero = "99999-9999";
	
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
				
	}

}
