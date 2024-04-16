import java.text.NumberFormat;
import java.util.Scanner;

public class C0810EX {
    public static void main(String[] args) {
        String nome, nomeMaiorInsumo = "";
        int quantidade;
        double preco, soma = 0, media = 0, maiorInsumo = 0;

        Scanner insumo = new Scanner(C0810EX.class.getResourceAsStream("C08EX10.txt"));

        while (insumo.hasNextLine())
        {
            nome = insumo.nextLine();
            quantidade = insumo.nextInt();
            preco = insumo.nextDouble();
            insumo.nextLine();

            soma += quantidade * preco;
            media = soma/4;

            if (maiorInsumo < preco)
            {
                maiorInsumo = preco;
                nomeMaiorInsumo = nome;
            }
        }
        System.out.printf("Custo Total --> %s\nMédia dos Custos Parciais --> %s\nNome do Insumo de maior custo parcia --> %s", NumberFormat.getCurrencyInstance().format(soma), NumberFormat.getCurrencyInstance().format(media), nomeMaiorInsumo);
    }
}
