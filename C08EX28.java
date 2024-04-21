public class C08EX28
{
    public static void main(String[] args)
    {
        int numero = 1, aux;
        double media = 0;

        for (aux = 1; aux <= numero; aux++)
        {

            numero = aux * (aux + 1) * (aux + 2);

            if (numero <= 1000 && numero > 0)
            {

                media += numero;
                System.out.printf("O número %d é triangular", numero);
                System.out.println();
            }
            else
            {
                break;
            }
        }
        aux--;
        media /= aux;
        System.out.printf("%.0f", media);
    }
}
