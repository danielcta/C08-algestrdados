import javax.swing.*;

public class C08EX06
{
    public static void main(String[] args)
    {

        long indice, soma = 0;
        int par = 0, impar = 0, diviseis3 = 0;

        for (int aux = 1; aux <= 10; aux++) {
            indice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe  número:",
                    "Exercício 6",
                    JOptionPane.QUESTION_MESSAGE));


            if (indice % 2 == 0)
            {
                par++;
                System.out.printf("O número %d é par\n", indice);

            }  else
            {
                impar++;
                System.out.printf("O número %d é ímpar\n", indice);

            }
            if (indice % 3 == 0)
            {
                diviseis3++;

            }
            if (indice % 4 == 0)
            {
                soma += indice;
            }
        }
        System.out.printf("A soma dos números informados divisíveis por 4 é igual a %d\nForam digitados %d números que são divisíveis por 3", soma, diviseis3);
    }
}