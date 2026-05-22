import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota numérica (0.0 a 5.0): ");
        double nota = scanner.nextDouble();

        if (nota >= 4.6 && nota <= 5.0) {
            System.out.println("Letra: A (Excelente)");
        } else if (nota >= 4.0 && nota < 4.6) {
            System.out.println("Letra: B (Sobresaliente)");
        } else if (nota >= 3.5 && nota < 4.0) {
            System.out.println("Letra: C (Aceptable)");
        } else if (nota >= 3.0 && nota < 3.5) {
            System.out.println("Letra: D (Aprobado mínimo)");
        } else if (nota >= 0.0 && nota < 3.0) {
            System.out.println("Letra: F (Reprobado)");
        } else {
            System.out.println("Nota fuera de rango válido.");
        }

        scanner.close();
    }
}