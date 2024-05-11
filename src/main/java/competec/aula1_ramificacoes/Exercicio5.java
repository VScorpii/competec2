package competec.aula1_ramificacoes;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva um numero para ver se ele é multiplo de 3 ou 5: ");
        int num = sc.nextInt();
        boolean multiploDe3 = num % 3 == 0;
        boolean multiploDe5 = num % 5 == 0;
        boolean condicaoFinal = multiploDe3 || multiploDe5;

        System.out.println(condicaoFinal);
    }
}
