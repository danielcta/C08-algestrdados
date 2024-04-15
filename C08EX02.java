import java.util.Scanner;

public class C08EX02
{
    public static void main(String[] args)
    {
        int faltas;
        float nota;
        Scanner teclado = new Scanner(System.in);
        for (int repetition = 1; repetition <= 50; repetition++)
        {
            System.out.print("Informe a nota final do aluno: ");
            nota = teclado.nextFloat();
            if (nota <= -1)
            {
                break;
            }
            System.out.print("Informe quantas faltas o aluno tem: ");
            faltas = teclado.nextInt();
            if (nota >= 65 && faltas <= 16)
            {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO APROVADO");
            }
            else if (nota <= 65 || faltas >= 16)
            {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO REPROVADO");
            }
        }
        teclado.close();
    }
}
