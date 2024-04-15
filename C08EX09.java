import javax.swing.*;

public class C08EX09
{
    public static void main(String[] args)
    {
        String nome;
        String[] options = {"M", "F"};
        int idade, quantPessoas, sexo, somaHomens = 0, somaMulheres = 0, homens = 0, mulheres = 0, aux;
        double mediaMulheres, mediaHomens;
        quantPessoas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe a quantidade de pessoas:",
                "Exercício 9",
                JOptionPane.QUESTION_MESSAGE));

        for (aux = 1; aux <= quantPessoas; aux++)
        {

            nome = JOptionPane.showInputDialog(null,
                    "Informe o nome do participante:",
                    "Exercício 9",
                    JOptionPane.QUESTION_MESSAGE);
            sexo = JOptionPane.showOptionDialog(null,
                "Qual o seu gênero: ",
                "Exercício 9",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                "");
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe a idade do participante:",
                    "Exercício 9",
                    JOptionPane.QUESTION_MESSAGE));
            if (sexo == 0)
            {
            somaHomens += idade;
            homens++;

            } else
            {
                somaMulheres += idade;
                mulheres++;
            }
            System.out.printf("Nome = %s\nIdade = %d\nSexo = %s\n", nome, idade, options[sexo]);
        }
        mediaHomens = (float) somaHomens / homens;
        mediaMulheres = (float) somaMulheres / mulheres;
        System.out.printf("Média das idades dos homens = %7.2f\nMédia das idades das mulheres = %7.2f", mediaHomens, mediaMulheres);
    }
}
