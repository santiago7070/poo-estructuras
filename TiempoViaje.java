import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los minutos totales: ");
        int minutosTotales = scanner.nextInt();

        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;
        long segundosTotales = (long) minutosTotales * 60;

        System.out.printf("Tiempo ingresado: %d minutos%n", minutosTotales);
        System.out.printf("Equivale a:       %d horas, %d minutos, 0 segundos%n", horas, minutosRestantes);
        System.out.printf("En segundos:      %d segundos%n", segundosTotales);

        scanner.close();
    }
}
