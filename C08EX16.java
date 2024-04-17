public class C08EX16
{
    public static void main(String[] args)
    {
        int  soma = 0, media, impares = 0;

        for (int aux = 1000; aux <= 2000; aux++)
        {
            if (aux % 2 != 0)
            {
                soma += aux;
                impares++;
            }
        }
        media = soma / impares;
        System.out.printf("%d", media);

    }
}
