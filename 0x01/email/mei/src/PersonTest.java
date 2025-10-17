import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonTest {

	public static Person person = new Person();

	@BeforeAll
	public static void setup() throws ParseException {
		person.setName("Paul");
		person.setSurname("McCartney");
		person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000"));
		person.setAnotherCompanyOwner(true);
		person.setPensioner(true);
		person.setPublicServer(true);
		person.setSalary(1200);
	}

	@Test
	public void show_full_name() {
		String fullName = person.fullName();
		Assertions.assertEquals("Paul McCartney", fullName);
	}

	@Test
	public void test_calculateYearlySalary() {
		float salaryYearly = 1200 * 12;
		Assertions.assertEquals(salaryYearly, person.calculateYearlySalary());
	}

	@Test
	public void person_is_MEI() {
		person.setAnotherCompanyOwner(false);
		person.setPensioner(false);
		person.setPublicServer(false);
		Assertions.assertTrue(person.isMEI());
	}

	@Test
	public void person_is_not_MEI() {
		person.setAnotherCompanyOwner(true);
		person.setPensioner(false);
		person.setPublicServer(true);
		Assertions.assertFalse(person.isMEI());
	}
}
