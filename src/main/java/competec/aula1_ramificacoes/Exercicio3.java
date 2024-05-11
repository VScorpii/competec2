package competec.aula1_ramificacoes;

public class Exercicio3 {
    public static void main(String[] args) {
        
        boolean chovendo = true, relampejando = false;
        boolean temMacarrao = true, temEstrogonofe = false;

        if (chovendo && relampejando) {
            System.out.println("Não irei sair de casa.");
        }
        else {
            System.out.println("Irei sair de casa.");
        }

        if (temMacarrao || temEstrogonofe) {
            System.out.println("Vou ficar muito feliz.");
        }
        else {
            System.out.println("Não irei ficar muito feliz.");
        }

    }
}
