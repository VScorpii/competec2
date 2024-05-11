package competec.aula2_loops;

import java.util.Scanner;

public class Desafio22 
	{
		public static void main(String[] args) 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Escreva um número inteiro: ");
				int num = scanner.nextInt();

				for (int i = 0; i <= num; i++)
					{
						if (i % 2 != 0) System.out.printf("Numero impar: %s\n", i);

						if (i % 2 == 0)
							{
								continue;
								// System.out.printf("Numero par: %s\n", i);
							}
					}
				scanner.close();
			}
	}
