public class C08EX27 {
    public static void main(String[] args) {
        for (int aux = 1; aux <= 2; aux++) {
            for (int aux2 = 1; aux2 <= 8; aux2++) {
                for (int aux3 = 1; aux3 <= Math.pow(2, aux2 - 1); aux3++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            for (int aux2 = 7; aux2 >= 1; aux2--) {

                for (int aux3 = 1; aux3 <= Math.pow(2, aux2 - 1); aux3++) {
                    System.out.print("*");

                }
                System.out.println();

            }
        }
    }
}