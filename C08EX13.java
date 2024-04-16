import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX13
{
    public static void main(String[] args)
    {
        String nomeCidade;
        long populacao, qntEleitores, qntMulheres, qntHomens, percentual;

        Scanner cidades = new Scanner(C08EX13.class.getResourceAsStream("C08EX13.txt"));

        while (cidades.hasNextLine())
        {
            nomeCidade = cidades.nextLine();
            populacao = cidades.nextLong();
            qntEleitores = cidades.nextLong();
            qntMulheres = cidades.nextLong();
            qntHomens = cidades.nextLong();
            cidades.nextLine();

            if(qntHomens + qntMulheres != populacao)
            {
            System.out.printf("A soma entre a quantidade de homens e mulheres da cidade de %s é diferente da quantidade da população\n", nomeCidade);

            }
             percentual = (qntEleitores / populacao) * 100;
            System.out.printf("%d", percentual);
        }
    }
}
