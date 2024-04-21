import javax.swing.*;

public class C08EX29
{
    public static void main(String[] args)
    {
        long y, x, resultado = 1;

        x = Long.parseLong(JOptionPane.showInputDialog(null,
                "Qual o valor de x?",
                "Exercício 29",
                JOptionPane.QUESTION_MESSAGE));
        while (x <= 0)
        {
            JOptionPane.showMessageDialog(null,
                    "X deve ser maior que zero!",
                    "Exercício 29",
                    JOptionPane.ERROR_MESSAGE);

            x = Long.parseLong(JOptionPane.showInputDialog(null,
                    "Qual o valor de x?",
                    "Exercício 29",
                    JOptionPane.QUESTION_MESSAGE));
        }

        y = Long.parseLong(JOptionPane.showInputDialog(null,
                "Qual o valor de y?",
                "Exercício 29",
                JOptionPane.QUESTION_MESSAGE));
        while (y <= 0)
        {
            JOptionPane.showMessageDialog(null,
                    "Y deve ser maior que zero!",
                    "Exercício 29",
                    JOptionPane.ERROR_MESSAGE);

            y = Long.parseLong(JOptionPane.showInputDialog(null,
                    "Qual o valor de y?",
                    "Exercício 29",
                    JOptionPane.QUESTION_MESSAGE));
        }
        for (int aux = 1; aux <= y; aux++)
        {

                resultado *= x;

        }
        System.out.printf("%d^%d = %d", x, y, resultado);
    }
}
