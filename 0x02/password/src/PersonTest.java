import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

	private Person person;

	@BeforeAll
	public void setup() {
		person = new Person();
	}

	@ParameterizedTest
	@ValueSource(strings = { "PaulMcCartney2", "NeilArms2" })
	public void check_user_valid(String username) {
		boolean isValid = person.checkUser(username);
		assertTrue(isValid);
	}

	@ParameterizedTest
	@ValueSource(strings = { "Paul#McCartney", "Neil@Arms" })
	public void check_user_not_valid(String username) {
		boolean isNotValid = person.checkUser(username);
		assertFalse(isNotValid);
	}

	@ParameterizedTest
	@ValueSource(strings = { "123456789", "#$%1234" })
	public void does_not_have_letters(String password) {
		boolean isNotValid = person.checkPassword(password);
		assertFalse(isNotValid);
	}

	@ParameterizedTest
	@ValueSource(strings = { "Abcabcdefgh@", "#hbtn@%tc" })
	public void does_not_have_numbers(String password) {
		boolean isNotValid = person.checkPassword(password);
		assertFalse(isNotValid);
	}

	@ParameterizedTest
	@ValueSource(strings = { "Abc@123", "12$@hbt" })
	public void does_not_have_eight_chars(String password) {
		boolean isNotValid = person.checkPassword(password);
		assertFalse(isNotValid);
	}

	@ParameterizedTest
	@ValueSource(strings = { "abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123" })
	public void check_password_valid(String password) {
		boolean isValid = person.checkPassword(password);
		assertTrue(isValid);
	}
}
