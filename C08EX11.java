import javax.swing.*;
import java.text.NumberFormat;

public class C08EX11 {
    public static void main(String[] args)
    {
        String nome, nomeMaiorSalario = "", salarioFormatado, diferencaFormatada;
        String[] opcoesGenero = {"M", "F"}, opcoesEstadoCivil = {"C", "S", "O"}, opcoesCorOlhos = {"A", "C", "P", "O"}, opcoesCorCabelo = {"L", "P", "C", "R"}, opcoesEscolaridade = {"1", "2", "3", "4"};
        int idade, genero, estadoCivil, corOlhos, corCabelo, escolaridade, mulherSupimpa = 0;
        double salario, maiorSalario = 0, diferenca, maiorSalarioHomens = 0, menorSalarioHomens = 0;
        for (int aux = 1; aux <= 50; aux++)
        {

            nome = JOptionPane.showInputDialog(null,
                    "Qual o seu nome?",
                    "Exercício 11",
                    JOptionPane.QUESTION_MESSAGE);
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual a sua idade?",
                    "Exercício 11",
                    JOptionPane.QUESTION_MESSAGE));
            genero = JOptionPane.showOptionDialog(null,
                    "Qual o seu gênero?\nM - Masculino\nF - Feminino",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesGenero,
                    "");
            estadoCivil = JOptionPane.showOptionDialog(null,
                    "Qual o seu estado civil?\nC - Casado\nS - Solteiro\nO - Outro",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesEstadoCivil,
                    "");
            corOlhos = JOptionPane.showOptionDialog(null,
                    "Qual a cor dos seus olhos?\nA - Azul\nC - Castanho\nP - Preto\nO - Outra cor",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesCorOlhos,
                    "");
            corCabelo = JOptionPane.showOptionDialog(null,
                    "Qual a cor dos seus cabelos?\nL - Loiro\nP - Preto\nC - Castanho\nR - Ruivo\nO - Outra cor",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesCorCabelo,
                    "");
            escolaridade = JOptionPane.showOptionDialog(null,
                    "Qual o seu nível de escolaridade?\n1 - 1° grau\n2 - 2° grau\n3 - 3° grau\n4 - 4° grau",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesEscolaridade,
                    "");
            salario = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Quanto ganha atualmente?,",
                    "Exercício 11",
                    JOptionPane.QUESTION_MESSAGE));

            if (genero == 1 &&  corCabelo == 0 && corOlhos == 0 && idade >= 18 && idade <= 25 && estadoCivil == 1 && salario >= 10000 && escolaridade == 3)
            {
                mulherSupimpa++;
            }
            if (aux == 1 || salario > maiorSalario)
            {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }
            if (genero == 0 && salario > maiorSalarioHomens)
            {
                maiorSalarioHomens = salario;
            }
            if ((aux == 1 || salario < menorSalarioHomens) && genero == 0)
            {
                menorSalarioHomens = salario;
            }
        }

        salarioFormatado = NumberFormat.getCurrencyInstance().format(maiorSalario);
        diferenca = maiorSalarioHomens - menorSalarioHomens;
        diferencaFormatada = NumberFormat.getCurrencyInstance().format(diferenca);
        System.out.printf("Quantidade de mulheres supimpa: %d\nPessoa com maior salário: %s, %s\nDiferença entre o maior e menor salário dos homens: %s", mulherSupimpa, nomeMaiorSalario, salarioFormatado, diferencaFormatada);
    }
}
