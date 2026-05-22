import java.util.Scanner;

public class BusquedaNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[8];

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Ingrese el nombre del paciente %d: ", (i + 1));
            nombres[i] = scanner.nextLine();
        }

        System.out.print("\nIngrese el nombre del paciente a buscar: ");
        String nombreBuscar = scanner.nextLine();

        int posicionEncontrada = -1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                posicionEncontrada = i;
                break;
            }
        }

        if (posicionEncontrada != -1) {
            System.out.printf("El paciente '%s' fue encontrado en la posición (índice): %d%n", nombreBuscar, posicionEncontrada);
        } else {
            System.out.printf("El paciente '%s' no se encuentra registrado.%n", nombreBuscar);
        }

        scanner.close();
    }
}