package competec.aula2_loops;

import java.util.Scanner;

public class Desafio0 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");

		int numero = scanner.nextInt();

		if ( numero % 2 == 0) {
			System.out.printf("O número que você digitou: %s é par\n", numero);
		} else {
			System.out.printf("O número que você digitou: %s é impar\n", numero);
		}
		scanner.close();
	}
}
