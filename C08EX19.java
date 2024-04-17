public class C08EX19
{
    public static void main(String[] args)
    {
        long numero, soma = 0;
        for (int aux = 1; aux <= 100; aux++)
        {
            numero = (int) Math.pow(aux, 2);
            soma += numero;

        }
        System.out.printf("%d\n", soma);
    }
}
