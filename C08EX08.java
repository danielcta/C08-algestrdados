import java.util.Scanner;

public class C08EX08
{
    public static void main(String[] args)
    {
        int faltas, faltas16 = 0, aux;
        double nota, soma = 0, media;
        Scanner teclado = new Scanner(System.in);
        for (aux = 1; aux <= 3; aux++)
        {
            System.out.print("Informe a nota final do aluno: ");
            nota = teclado.nextFloat();
            soma += nota;
            System.out.print("Informe quantas faltas o aluno tem: ");
            faltas = teclado.nextInt();
            if (nota >= 65 && faltas <= 16)
            {
                System.out.printf("Nota = %5.2f e Falta = %d --> ALUNO APROVADO\n", nota, faltas);
            }
            else if (nota <= 65 || faltas >= 16)
            {
                System.out.printf("Nota = %5.2f e Falta = %d --> ALUNO REPROVADO\n", nota, faltas);
            }
            if (faltas > 16)
            {
                faltas16++;
            }

        }
        aux--;
        media = soma / aux;
        System.out.printf("Média das notas dos aprovado = %5.2f\nQuantidade de alunos com mais de 16 faltas = %d", media, faltas16);
        teclado.close();
    }
}