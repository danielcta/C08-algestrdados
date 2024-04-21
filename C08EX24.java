public class C08EX24
{
    public static void main(String[] args)
    {
        double soma = 0, serie;

        for (int aux = 1; aux <= 99; aux+=2)
        {
            soma += Math.pow(2, aux);

        }

        serie = (float) 1/3 * soma;
        System.out.printf("O resultado para a série solicitada é equivalente a %.0f", serie);
    }
}
