import javax.swing.*;

public class C08EX14 {
    public static void main(String[] args)
    {
        int n;
        String simbolo;

        n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número: ",
                "Exercício 14",
                JOptionPane.QUESTION_MESSAGE));

        simbolo = JOptionPane.showInputDialog(null,
                "Digite um caractere qualquer: ",
                "Exercício 14",
                JOptionPane.QUESTION_MESSAGE);

        for (int aux = 1; aux <= n; aux++)
        {
            for (int aux2 = 1; aux2 <= n; aux2++)
            {
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }
    }
}
