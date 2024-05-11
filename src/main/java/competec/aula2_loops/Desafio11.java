package competec.aula2_loops;

public class Desafio11 
	{
		public static void main(String[] args) 
			{
				int soma = 0; 
				
				for (int i = 0; i <= 100; i++)
					{
						soma+=i;
					}
				System.out.printf("O valor da soma é: %s\n", soma);
			}
	}
