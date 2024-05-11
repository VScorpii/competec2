package competec.aula1_ramificacoes;

public class Exercicio4 {
    public static void main(String[] args) {
        int idadeA = 23;
        int idadeB = 11;

        boolean comparacaoMesmaIdadeEAMaiorQue18 = (idadeA == idadeB) && idadeA > 18;
        boolean comparacaoIdadeDiferenteEBMenorQue12 = (idadeA != idadeB) && idadeB < 12;
        System.out.println(comparacaoMesmaIdadeEAMaiorQue18);
        System.out.println(comparacaoIdadeDiferenteEBMenorQue12);
    }
}
