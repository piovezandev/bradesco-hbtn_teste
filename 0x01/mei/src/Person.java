import java.util.Date;

public class Person {

	private String name;
	private String surname;
	private Date birthDate;
	private boolean anotherCompanyOwner;
	private boolean pensioner;
	private boolean publicServer;
	private float salary;

	public boolean isMEI() {
		return calculateYearlySalary() < 130000
				&& isMaiorIdade() 
				&& !this.anotherCompanyOwner 
				&& !this.pensioner
				&& !this.publicServer;
	}

	@SuppressWarnings("deprecation")
	private boolean isMaiorIdade() {
		return ((2025 - this.birthDate.getYear()) > 18);
	}

	public float calculateYearlySalary() {
		return this.salary * 12;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String fullName() {
		return this.name + " " + this.surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isAnotherCompanyOwner() {
		return anotherCompanyOwner;
	}

	public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
		this.anotherCompanyOwner = anotherCompanyOwner;
	}

	public boolean isPensioner() {
		return pensioner;
	}

	public void setPensioner(boolean pensioner) {
		this.pensioner = pensioner;
	}

	public boolean isPublicServer() {
		return publicServer;
	}

	public void setPublicServer(boolean publicServer) {
		this.publicServer = publicServer;
	}

}
