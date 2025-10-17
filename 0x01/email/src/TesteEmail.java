import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteEmail {

	@Test
	public void testar_email_com_arroba() {
		Boolean isValid = Pessoa.emailValid("email_teste@dominio.com.br");
		Assertions.assertTrue(isValid);
	}
	
	@Test
	public void testar_email_sem_arroba() {
		Boolean isValid = Pessoa.emailValid("email_testedominio.com.br");
		Assertions.assertFalse(isValid);
	}	

	@Test
	public void testar_email_mais_50_caracteres() {
		Boolean isValid = Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
		Assertions.assertEquals(Boolean.FALSE, isValid);
	}
}
