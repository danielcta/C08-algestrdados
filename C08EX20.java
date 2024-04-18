import javax.swing.*;

public class C08EX20
{
    public static void main(String[] args)
    {
        double numero = 1, n;

        n = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe a quantos números deseja iprimir? ",
                "Exercício 20",
                JOptionPane.QUESTION_MESSAGE));

        for (int aux = 1; aux <= n; aux++)
        {
            numero *= 2;

        }
        System.out.printf("%.0f\n", numero);

    }
}
