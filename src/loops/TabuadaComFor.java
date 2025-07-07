package loops;

public class TabuadaComFor {
        public static void main(String[] args) {

            for (int n = 1; n <= 10; n++) {
                System.out.println("Tabuada do " + n);
                for (int i = 0; i <= 10; i++) {
                    int r = n * i;
                    System.out.println(n + " x " + i + " = " + r);
                }
                System.out.println("---------------------------------");
            }
        }
    }

