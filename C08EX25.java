public class C08EX25 {
    public static void main(String[] args) {
        for (int aux = 1; aux <= 10; aux++) { // determina quantas vezes o conjunto completo irá se repetir
            for (int aux2 = 1; aux2 <= 10; aux2++) { // determina quantas vezes o conjunto crescente irá se repetir
                for (int aux3 = 1; aux3 <= aux2; aux3++) { // determina a quantidades de colunas em cada linha do conjunto crescente
                    System.out.print("* ");
                }
                System.out.println();
            }

            for (int aux2 = 10; aux2 >= 1; aux2--) { // determina quantas vezes o conjunto crescente irá se repetir
                for (int aux3 = 1; aux3 <= aux2; aux3++) { // determina quantas vezes o conjunto crescente irá se repetir
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

