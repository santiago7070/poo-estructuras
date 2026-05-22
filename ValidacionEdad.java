import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int edad = 0;

        while (true) {
            System.out.print("Ingrese su edad (1 a 120): ");
            edad = scanner.nextInt();

            if (edad >= 1 && edad <= 120) {
                break;
            }

            System.out.println("Error: La edad ingresada no es válida. Debe estar entre 1 y 120 años.");
        }

        System.out.print("Etapa de vida: ");
        if (edad <= 12) {
            System.out.println("Niñez");
        } else if (edad <= 17) {
            System.out.println("Adolescencia");
        } else if (edad <= 25) {
            System.out.println("Juventud");
        } else if (edad <= 59) {
            System.out.println("Adultez");
        } else {
            System.out.println("Tercera edad");
        }

        scanner.close();
    }
}
    