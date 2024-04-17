import javax.swing.*;

public class C08EX18
{
    public static void  main(String[] args)
    {
        int x, resultado;

        x = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe um número de 1 a 9 para imprimir a tabuada do número: ",
                "Exercício 18",
                JOptionPane.QUESTION_MESSAGE));

        for (int aux = 1; aux <= 9; aux++)
        {
            resultado = aux * x;
            System.out.printf("%d x %d = %d\n", aux, x, resultado);
        }
    }
}
