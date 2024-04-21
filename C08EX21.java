import javax.swing.*;

public class C08EX21
{
    public static void main(String[] args)
    {
        String situacao;
        double altura, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual a sua altura?",
                "Exercício 21",
                JOptionPane.QUESTION_MESSAGE));

        System.out.println("PESO..........IMC..........SITUAÇÃO CORPÓREA");

        for (int peso = 60; peso <= 100; peso++)
        {
            imc = peso / Math.pow(altura, 2);
            if (imc < 20)
            {
                situacao = "ABAIXO DO PESO";

            } else if (imc >= 20 && imc <= 25)
            {
                situacao = "PESO IDEAL";
            }
            else
            {
                situacao = "ACIMA DO PESO";
            }
            System.out.printf("%dkg..........%.2f..........%s\n", peso, imc, situacao);
        }
    }
}
