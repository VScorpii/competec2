package competec.aula2_loops;

import java.util.Scanner;

	public class Desafio21 
	{
		public static void main (String[] args) 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Digite um número para a taboada: ");
				int num = scanner.nextInt();

				for (int i = 0; i <= 10; i++)
					{
						System.out.printf("%s x %s = %s\n", num, i, num*i);
					}
				scanner.close();
			}
	}
