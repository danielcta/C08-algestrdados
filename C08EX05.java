import javax.swing.*;
import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args)
    {
        int candidato, fulano = 0, ciclano = 0, beltrano = 0;
        String candidatoVencedor = "1";

        Scanner sc = new Scanner(System.in);

        for (int aux = 1; aux <= 100; aux++)
        {
            System.out.print("Olá eleitor " + aux + ", informe o seu candidato: ");
            candidato = sc.nextInt();
            if (candidato == 1)
            {
                fulano++;
            }
             else if (candidato == 2)
            {
                ciclano++;
            }
            else if (candidato == 3)
            {
                beltrano++;
            }
            else if (candidato == 0)
            {
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Selecione um candidato válido!\n1 - Fulano\n2 - Ciclano\n3 - beltrano", "Erro ao Selecionar Candidato", JOptionPane.ERROR_MESSAGE);
                aux--;
            }
        }
        if (fulano > ciclano && fulano > beltrano)
        {
            candidatoVencedor = "Fulano";
        }
        else if (fulano < ciclano && ciclano > beltrano)
        {
            candidatoVencedor = "Ciclano";
        }
        else if (beltrano > ciclano && fulano < beltrano)
        {
            candidatoVencedor = "Beltrano";
        }

        System.out.printf("Fulano possui %d votos\nCiclano possui %d votos\nBeltrano possui %d votos\nO Candidato eleito foi %s", fulano, ciclano, beltrano, candidatoVencedor);
        sc.close();
    }
}
