package competec.aula1_ramificacoes;

// 1. Compare o seu nome com o nome do colega ao lado e veja se são iguais
// 2. Faça uma comparação para descobrir se você é mais novo que o professor;

public class Exercicio2 {
    public static void main(String[] args) {
        String meuNome = "Victor", nomeColega = "Vinicius";
        int minhaIdade = 22, idadeProfessor = 21;

        boolean comparacaoNome = meuNome.equals(nomeColega);
        boolean comparacaoIdade = minhaIdade < idadeProfessor;

        System.out.println("Minha idade é menor que a do professor? " + comparacaoIdade);
        System.out.println("Meu nome é igual ao nome do colega? " + comparacaoNome);


    }
}
