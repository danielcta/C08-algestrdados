import javax.swing.*;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX31
{
    public static void main(String[] args)
    {
      String nome, codigo, nomeMenorSalario = "", cargo, cargoMenorSalario = "";
      int engenheirosComSalarioMinimo = 0, administradores = 0, outros = 0, qntEngenheirosPesquisados, quantidade = 0;
      double salario, mediaAdm = 0, menorSalario = Double.MAX_VALUE;

        Scanner engenheiros = new Scanner(C08EX31.class.getResourceAsStream("C08EX31.txt")); //fazer download do arquivo C08EX31.txt no mesmo diretório do github

        qntEngenheirosPesquisados = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Qual a quantidade de engenheiros pesquisados?",
                "Exercício 31",
                JOptionPane.QUESTION_MESSAGE));

        while (engenheiros.hasNextLine())
        {
            quantidade++;

            nome = engenheiros.nextLine();
            codigo = engenheiros.nextLine();
            salario = engenheiros.nextDouble();
            engenheiros.nextLine();

            if (codigo.equals("C"))
            {
                cargo = "ENGENHEIRO CALCULISTA";
            }
            else if (codigo.equals("P"))
            {
                cargo = "ENGENHEIRO PROJETISTA";
            }
            else if (codigo.equals("O"))
            {
                cargo = "ENGENHEIRO DE OBRA";
            }
            else if (codigo.equals("A"))
            {
                cargo = "ENGENHEIRO ADMINISTRADOR";
            }
            else
            {
                cargo = "OUTROS";
            }



            if (codigo.equals("C") && salario < 2500 || codigo.equals("P") && salario < 4650 || codigo.equals("O") && salario < 3200 || codigo.equals("A") && salario < 5100)
            {
                System.out.printf("ENGENHEIRO: %s\nCARGO: %s\nSALÁRIO: %s --> ABAIXO DO SALÁRIO MÍNIMO\n", nome, cargo, NumberFormat.getCurrencyInstance().format(salario));
                System.out.println();
            }
            else
            {
                System.out.printf("ENGENHEIRO: %s\nCARGO: %s\nSALÁRIO: %s\n", nome, cargo, NumberFormat.getCurrencyInstance().format(salario));
                System.out.println();
            }

            if (codigo.equals("C") && salario >= 2500 || codigo.equals("P") && salario >= 4650 || codigo.equals("O") && salario >= 3200 || codigo.equals("A") && salario >= 5100)
            {
                engenheirosComSalarioMinimo++;
            }



            if (codigo.equals("A"))
            {
                administradores++;
                mediaAdm += salario;
            }
            else if (codigo.equals("X") && salario > 5000)
            {
                outros++;
            }
            if (salario < menorSalario)
            {
                nomeMenorSalario = nome;
                cargoMenorSalario = cargo;
                menorSalario = salario;
            }


        }
        if (qntEngenheirosPesquisados >= quantidade)
        {
            System.out.printf("SÓ FORAM REGISTRADOS %d ENGENHEIROS\n", quantidade);
            System.out.println();
        }

        mediaAdm /= administradores;
        System.out.printf("QUANTIDADE DE ENGENHEIROS COM SALÁRIO EQUIVALENTE OU ACIMA DO SALÁRIO MÍNIMO: %d\nMÉDIA DOS SALÁRIOS DOS ADMINISTRADORES = %s\nQUANTIDADE DE ENGENHEIROS DE CARGO OUTROS QUE RECEBEM MAIS DE R$ 5.000,00: %d\n", engenheirosComSalarioMinimo, NumberFormat.getCurrencyInstance().format(mediaAdm), outros);
        System.out.println();
        System.out.printf("ENGENHEIRO COM MENOR SALÁRIO: %s\nCARGO: %s\nMENOR SALÁRIO: %s", nomeMenorSalario, cargoMenorSalario, NumberFormat.getCurrencyInstance().format(menorSalario));

    }
}
