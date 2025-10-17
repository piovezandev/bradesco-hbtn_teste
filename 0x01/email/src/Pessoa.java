public class Pessoa {
	private static final int TAMANHO_MAXIMO = 50;
	
	public static boolean emailValid(String email) {
		return email != null && email.contains("@") && email.length() <= TAMANHO_MAXIMO;
	}
}
