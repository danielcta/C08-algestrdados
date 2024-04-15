import java.util.Scanner;
public class C08EX01 {
    public static void main(String[] args) {
        double pi, R, a;
        pi = 3.1416;
        Scanner teclado = new Scanner(System.in);
        for (int repetition = 1; repetition <= 10; repetition++) {
            System.out.print("Informe o valor do raio do " + repetition + "° círculo: ");
            R = teclado.nextDouble();
            a = pi * Math.pow(R, 2);
            System.out.println("r" + repetition + " = " + a);
        }
        teclado.close();
    }
}