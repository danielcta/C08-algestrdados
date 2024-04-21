import javax.swing.*;

public class C08EX30
{
    public static void main(String[] args)
    {
        double serie, x, n;

        x = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual o valor de x?",
                "Exercício 30",
                JOptionPane.QUESTION_MESSAGE));
        while (x == 0)
        {
            JOptionPane.showMessageDialog(null,
                    "x não deve ser equivalente a zero!",
                    "Exercício 30",
                    JOptionPane.ERROR_MESSAGE);

            x = Long.parseLong(JOptionPane.showInputDialog(null,
                    "Qual o valor de x?",
                    "Exercício 30",
                    JOptionPane.QUESTION_MESSAGE));
        }
        n = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual o valor de n?",
                "Exercício 30",
                JOptionPane.QUESTION_MESSAGE));
        while (n == 0)
        {
            JOptionPane.showMessageDialog(null,
                    "n não deve ser equivalente a zero!!",
                    "Exercício 30",
                    JOptionPane.ERROR_MESSAGE);

            n = Long.parseLong(JOptionPane.showInputDialog(null,
                    "Qual o valor de n?",
                    "Exercício 30",
                    JOptionPane.QUESTION_MESSAGE));
        }
        serie = x;

        for (int aux = 1; aux <= n; aux++)
        {
            serie += Math.pow(x, aux)/aux;
        }
        System.out.printf("S = %.2f", serie);
    }
}
