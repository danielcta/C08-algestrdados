import java.util.Scanner;

public class C0810EX {
    public static void main(String[] args) {
        String nome, nomeMaiorInsumo = "";
        int quantidade;
        double preco, soma = 0, media = 0, custoTotal = 0, maiorInsumo = 0;

        Scanner insumo = new Scanner(C0810EX.class.getResourceAsStream("C08EX10.txt"));

        while (insumo.hasNextLine())
        {
            nome = insumo.nextLine();
            quantidade = insumo.nextInt();
            preco = insumo.nextDouble();
            insumo.nextLine();

            soma += quantidade * preco;
            custoTotal += soma;
            media = soma/4;

            if (maiorInsumo < preco)
            {
                maiorInsumo = preco;
                nomeMaiorInsumo = nome;
            }
        }
        System.out.printf("Custo Total --> %11.2f\nMédia dos Custos Parciais --> %11.2f\nNome do Insumo de maior custo parcia --> %s", soma, media, nomeMaiorInsumo);
    }
}
