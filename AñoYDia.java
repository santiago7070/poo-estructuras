import java.util.Scanner;

public class AñoYDia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        System.out.print("Ingrese un número del 1 al 7 para el día: ");
        int numeroDia = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.printf("El año %d es bisiesto.%n", anio);
        } else {
            System.out.printf("El año %d no es bisiesto.%n", anio);
        }

        switch (numeroDia) {
            case 1:
                System.out.println("Día: lunes");
                break;
            case 2:
                System.out.println("Día: martes");
                break;
            case 3:
                System.out.println("Día: miércoles");
                break;
            case 4:
                System.out.println("Día: jueves");
                break;
            case 5:
                System.out.println("Día: viernes");
                break;
            case 6:
                System.out.println("Día: sábado");
                break;
            case 7:
                System.out.println("Día: domingo");
                break;
            default:
                System.out.println("Error: El número del día está fuera del rango (1-7).");
                break;
        }

        scanner.close();
    }
}
