import java.util.Scanner;

public class TablaMultiplicarExtendida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }

        scanner.close();
    }
}