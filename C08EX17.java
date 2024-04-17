public class C08EX17
{
    public static void main(String[] args)
    {
        double resultado;
        for (int x = 3; x <= 12; x++)
        {
            resultado = Math.sqrt(Math.pow(x, 2) - 3);
            System.out.printf("f(%d) = %6.4f\n", x, resultado);
        }

    }
}
