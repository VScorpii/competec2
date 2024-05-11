package competec.desafio_switch_case;
import java.util.Scanner;
public class desafio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int codigo = 0;
        float precoAbacaxi = 8.5f;
        float precoGoiaba = 2.0f;
        float precoLaranja = 1.3f;

        System.out.print("Digite o código para solicitar o preço do produto: ");
        codigo = read.nextInt();
        
        switch (codigo) {
            case 1:
                System.out.println("Código " + codigo + " Abacaxi - " + precoAbacaxi);
                break;
            case 2:
                System.out.println("Código " + codigo + " Goiaba - " + precoGoiaba);
                break;
            case 3:
                System.out.println("Código " + codigo + " Laranja - " + precoLaranja);
                break;
            default:
                System.out.println("Código de produto inexistente!");
                break;
        }
        read.close();
    }
}
