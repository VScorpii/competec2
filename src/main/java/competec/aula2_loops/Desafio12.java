package competec.aula2_loops;

import java.util.Scanner;

public class Desafio12 
	{
		public static void main(String[] args) 
			{
				Scanner scanner = new Scanner(System.in);

				String senha = "senha123"; // esta é a senha correta
				String tentativa = "";

				// faça o loop que lê as tentativas de senhas e verifica se elas estão corretas.



				while (!tentativa.equals(senha))
					{
						System.out.print("Digite a senha para acessar: ");
						tentativa = scanner.nextLine();
						if (tentativa.equals(senha))
							{
								System.out.println("Acesso permitido");
							}
						else 
							{
								System.out.println("Senha inválida.");
							}
					}
				scanner.close();
			}
	}
