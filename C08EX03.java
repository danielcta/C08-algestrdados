import java.util.Scanner;

public class C08EX03
{
    public static void main(String[] args)
    {
        int faltas, reprovados = 0, aprovados = 0;
        float nota;
        Scanner teclado = new Scanner(System.in);
        for (int repetition = 1; repetition <= 2; repetition++)
        {
            System.out.print("Informe a nota final do aluno: ");
            nota = teclado.nextFloat();
            if (nota <= -1)
            {
                System.out.println("Aprovados --> " + aprovados + "\nReprovados --> " + reprovados);
                break;
            }
            System.out.print("Informe quantas faltas o aluno tem: ");
            faltas = teclado.nextInt();
            if (nota >= 65 && faltas <= 16)
            {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO APROVADO");
                aprovados++;
            }
            else if (nota <= 65 || faltas >= 16)
            {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO REPROVADO");
                reprovados++;
            }

        }
        System.out.println("Aprovados --> " + aprovados + "\nReprovados --> " + reprovados);
        teclado.close();
    }
}
