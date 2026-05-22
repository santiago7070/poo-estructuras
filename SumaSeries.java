import java.util.Scanner;

public class SumaSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int sumaNaturalesCiclo = 0;
        int sumaParesCiclo = 0;
        int sumaCuadradosCiclo = 0;

        for (int i = 1; i <= n; i++) {
            sumaNaturalesCiclo += i;
            sumaParesCiclo += (2 * i);
            sumaCuadradosCiclo += (i * i);
        }

        int formulaNaturales = n * (n + 1) / 2;
        int formulaPares = n * (n + 1);
        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        System.out.printf("Serie 1 (Naturales) -> Ciclo: %d | Fórmula: %d%n", sumaNaturalesCiclo, formulaNaturales);
        System.out.printf("Serie 2 (Pares)     -> Ciclo: %d | Fórmula: %d%n", sumaParesCiclo, formulaPares);
        System.out.printf("Serie 3 (Cuadrados) -> Ciclo: %d | Fórmula: %d%n", sumaCuadradosCiclo, formulaCuadrados);

        scanner.close();
    }
}