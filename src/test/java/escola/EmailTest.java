package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Email(null)
				);
		assertThrows(IllegalArgumentException.class,
				() -> new Email("")
				);
		assertThrows(IllegalArgumentException.class,
				() -> new Email("emailinválido")
				);
	}
	
	@Test
	void DeveriaCriarEmailsComEnderecosValidos() {
		String endereco = "email@dominio.com.br";
		Email email = new Email(endereco);
		assertEquals(endereco, email.getEndereco());
				
	}

}
