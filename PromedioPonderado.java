import java.util.Scanner;

public class PromedioPonderado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota del primer parcial (30%): ");
        double parcial1 = scanner.nextDouble();

        System.out.print("Ingrese la nota del segundo parcial (30%): ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingrese la nota del examen final (40%): ");
        double examenFinal = scanner.nextDouble();

        double notaDefinitiva = (parcial1 * 0.30) + (parcial2 * 0.30) + (examenFinal * 0.40);

        String estado = (notaDefinitiva >= 3.0) ? "APROBADO" : "REPROBADO";

        System.out.printf("Nota definitiva: %.2f%n", notaDefinitiva);
        System.out.printf("Estado del estudiante: %s%n", estado);

        scanner.close();
    }
}