package br.com.fiap.fintech;
import java.time.LocalDate;

public class FintechApp {

	public static void main(String[] args) {
		
		Usuario userObject = new Usuario("user@example.com", "258456");
		System.out.println(userObject.getEmail());
		
		Cartao cardObject = new Cartao(1234567890123456l, "USER EXAMPLE", (short) 123, LocalDate.of(2025, 1, 1), 'C', userObject);
		System.out.println(cardObject.getCodSeguranca());
	}

}
