import java.util.Scanner;

public class C08EX04
{
    public static void main(String[] args)
    {
        int age, more18 = 0, less18 = 0;
        String name;

        Scanner sc = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++)
        {
            System.out.print("Informe o nome do aluno: ");
            name = sc.next(); //verificar com o professor(erro no nextLine())
            System.out.print("Informe a idade do aluno: ");
            age = sc.nextInt();
            if (age >= 18)
            {
                System.out.println("Nome: " + name + " \nIdade: " + age);
                more18++;
            }
            else
            {
                System.out.println("Nome: " + name + " \nIdade: " + age);
                less18++;
            }

        }
        System.out.println("Maiores de 18: " + more18 + "\nMenores de 18: " + less18);
        sc.close();
    }
}
