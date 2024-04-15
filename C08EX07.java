import javax.swing.*;
import java.util.Scanner;

public class C08EX07
{
    public static void main(String[] args)
    {
        String nome;
        int idade, ate12 = 0, acima30 = 0, soma = 0, aux;
        float media;

        for (aux = 1; aux <= 5; aux++)
        {
            nome = JOptionPane.showInputDialog(null,
                    "Insira o nome do aluno:",
                    "Exercício 7",
                    JOptionPane.QUESTION_MESSAGE);
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Insira a idade do aluno:",
                    "Exercício 7",
                    JOptionPane.QUESTION_MESSAGE));
            System.out.printf("%s, %d\n", nome, idade);
            soma += idade;
            if(idade <= 12)
            {
                ate12++;
            } else if (idade > 30)
            {
                acima30++;
            }
        }
        aux--;
        media = (float) soma/aux;
        System.out.printf("Alunos que tem até 12 anos = %d\nAlunos que tem acima de 30 anos = %d\nMédia das idade informadas = %7.1f", ate12, acima30, media);
    }
}
