import java.util.Scanner;

public class InversionArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo (máximo 20): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Tamaño no válido.");
            scanner.close();
            return;
        }

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese el elemento %d: ", i);
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Original:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < n / 2; i++) {
            int temporal = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = temporal;
        }

        System.out.print("Invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + "  ");
        }
        System.out.println();

        scanner.close();
    }
}