import java.util.Scanner;

public class NumerosPrimosRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite inferior (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el límite superior (b): ");
        int b = scanner.nextInt();

        int cantidad = 0;
        int suma = 0;
        boolean primerPrimo = true;

        System.out.print("Primos entre " + a + " y " + b + ": ");

        for (int i = a; i <= b; i++) {
            if (i < 2) {
                continue;
            }

            boolean esPrimo = true;
            int divisor = 2;
            int limite = (int) Math.sqrt(i);

            while (divisor <= limite) {
                if (i % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor++;
            }

            if (esPrimo) {
                if (!primerPrimo) {
                    System.out.print(", ");
                }
                System.out.print(i);
                primerPrimo = false;
                cantidad++;
                suma += i;
            }
        }

        System.out.println();
        System.out.printf("Cantidad: %d%n", cantidad);
        System.out.printf("Suma: %d%n", suma);

        scanner.close();
    }
}