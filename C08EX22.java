import javax.swing.*;

public class C08EX22
{
    public static void main(String[] args)
    {
        int numero, divisores = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe um número para verificar se ele é primo:",
                "Exercício 22",
                JOptionPane.QUESTION_MESSAGE));

        for (int aux = 1; aux <= numero; aux++)
        {
            if (numero % aux == 0)
            {
                divisores++;
            }

        }
        if (divisores == 2)
        {
            System.out.printf("O número %d é primo", numero);
        }
        else
        {
            System.out.printf("O número %d não é primo", numero);
        }
    }
}
