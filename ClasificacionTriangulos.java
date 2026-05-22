import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado C: ");
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("El triángulo es: Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es: Isósceles");
            } else {
                System.out.println("El triángulo es: Escaleno");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }

        scanner.close();
    }
}