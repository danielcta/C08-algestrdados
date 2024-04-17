import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX15
{
    public static void main(String[] args)
    {

        String nome, cargo, salarioFormatado, media, nomeMaiorSalario = "";
        double salario, soma = 0, maiorSalario = 0;
        int idade, contador = 0, aux = 1000, funcionarioAte18 = 0;

        Scanner funcionarios = new Scanner(C08EX15.class.getResourceAsStream("C08EX15.txt")); //fazer download do arquivo C08EX15.txt no mesmo diretório do github

        while (funcionarios.hasNextLine())
        {
            nome = funcionarios.nextLine();
            cargo = funcionarios.nextLine();
            salario = funcionarios.nextDouble();
            idade = funcionarios.nextInt();
            funcionarios.nextLine();

            salarioFormatado = NumberFormat.getCurrencyInstance().format(salario);
            contador++;

            if (salario > 10000 && idade > 50)
            {
                System.out.printf("Nome: %s --> Idade: %d --> Cargo: %s --> Salário: %s --> FUNCIONÁRIO SÊNIOR\n", nome, idade, cargo, salarioFormatado);

            }
            else
            {
                System.out.printf("Nome: %s --> Idade: %d --> Cargo: %s --> Salário: %s\n", nome, idade, cargo, salarioFormatado);
            }

            if (idade <= 18)
            {
                funcionarioAte18++;
                soma += salario;
            }
            if (contador == 1 || salario > maiorSalario)
            {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }

            if (contador >= aux)
            {
                break;
            }
        }
        media = NumberFormat.getCurrencyInstance().format(soma/funcionarioAte18);
        System.out.printf("Foram registrados %d funcionarios\nMédia dos salários dos funcionário com até 18 anos: %s\nFuncionário com o maior salário: %s, %s", contador, media, nomeMaiorSalario, NumberFormat.getCurrencyInstance().format(maiorSalario));
    }
}
