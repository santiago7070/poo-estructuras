import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de vehículo (1=Moto, 2=Carro, 3=Camioneta): ");
        int tipoVehiculo = scanner.nextInt();

        System.out.print("Ingrese el número de horas: ");
        int horas = scanner.nextInt();

        if (horas <= 0) {
            System.out.println("El número de horas debe ser mayor a 0.");
            scanner.close();
            return;
        }

        int tarifaPrimeraHora = 0;
        int tarifaHoraAdicional = 0;
        boolean opcionValida = true;

        switch (tipoVehiculo) {
            case 1:
                tarifaPrimeraHora = 2000;
                tarifaHoraAdicional = 1500;
                break;
            case 2:
                tarifaPrimeraHora = 4000;
                tarifaHoraAdicional = 3000;
                break;
            case 3:
                tarifaPrimeraHora = 5000;
                tarifaHoraAdicional = 4000;
                break;
            default:
                opcionValida = false;
                break;
        }

        if (opcionValida) {
            int totalPagar = tarifaPrimeraHora + (horas - 1) * tarifaHoraAdicional;
            System.out.printf("Total a pagar: $ %d%n", totalPagar);
        } else {
            System.out.println("Opción de vehículo no válida.");
        }

        scanner.close();
    }
}
