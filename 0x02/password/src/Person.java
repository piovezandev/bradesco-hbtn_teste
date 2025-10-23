public class Person {

	public boolean checkUser(String userName) {
		if (userName == null || userName.length() < 8) {
			return false;
		}

		return userName.matches("[a-zA-Z0-9]+");
	}

	public boolean checkPassword(String password) {
		boolean hasNumber = false;
		boolean hasSpecialChar = false;
		boolean hasUpperCase = false;

		if (password == null || password.length() < 8) {
			return false;
		}

		for (char character : password.toCharArray()) {
			if (Character.isUpperCase(character)) {
				hasUpperCase = true;
			} else if (Character.isDigit(character)) {
				hasNumber = true;
			} else if (!Character.isLetterOrDigit(character)) {
				hasSpecialChar = true;
			}
		}

		return hasUpperCase && hasNumber && hasSpecialChar;
	}

}
