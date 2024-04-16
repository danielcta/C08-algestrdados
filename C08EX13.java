import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX13
{
    public static void main(String[] args)
    {
        String nomeCidade, nomeMenorCidade = "";
        long populacao, qntEleitores, qntMulheres, qntHomens, menorPopulacao = Long.MAX_VALUE;
        int cidadeMaiorUmMilhao = 0, cidadeMulheres = 0;
        double percentual, decimal;

        Scanner cidades = new Scanner(C08EX13.class.getResourceAsStream("C08EX13.txt")); //fazer o download do arquivo C08EX13.txt no mesmo diretório do github

        while (cidades.hasNextLine())
        {
            nomeCidade = cidades.nextLine();
            populacao = cidades.nextLong();
            qntEleitores = cidades.nextLong();
            qntMulheres = cidades.nextLong();
            qntHomens = cidades.nextLong();
            cidades.nextLine();

            System.out.printf("%s\n", nomeCidade);
            if(qntHomens + qntMulheres != populacao)
            {
            System.out.printf(" A soma entre a quantidade de homens e mulheres da cidade de %s é diferente da quantidade da população\n", nomeCidade);

            }
            if (populacao > 1000000)
            {
                cidadeMaiorUmMilhao++;
            }
            if (qntMulheres > qntHomens)
            {
                cidadeMulheres++;
            }
            if (populacao < menorPopulacao)
            {
                menorPopulacao = populacao;
                nomeMenorCidade = nomeCidade;
            }
            percentual = (double) qntEleitores / populacao;
            System.out.printf(" Percentual de eleitores: %s\n\n", NumberFormat.getPercentInstance().format(percentual));
        }
        System.out.printf("Cidades com mais de um milhão (1.000.000) de habitantes: %d\nCidades que a quantidade de mulheres é maior que a quantidade de homens: %d\nCidade com menor população: %s\n", cidadeMaiorUmMilhao, cidadeMulheres, nomeMenorCidade);
    }
}
