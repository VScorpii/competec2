package competec.aula1_ramificacoes;

// 1. Se estiver chovendo E relampejando, eu não sairei de casa. Tente fazer essa comparação lógica no código
// 2. Se tiver macarrão ou estrogonofe hoje no almoço, vou ficar muito feliz! Tente fazer essa comparação lógica no código.

public class Exercicio3 {
    public static void main(String[] args) {
        
        boolean chovendo = true, relampejando = false;
        boolean temMacarrao = true, temEstrogonofe = false;

        if (chovendo && relampejando) {
            System.out.println("Não irei sair de casa.");
        }
        else {
            System.out.println("Irei sair de casa.")
        }

        if (temMacarrao || temEstrogonofe) {
            System.out.println("Vou ficar muito feliz.");
        }
        else {
            System.out.println("Não irei ficar muito feliz.");
        }

    }
}
