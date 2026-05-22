import java.util.Scanner;

public class Areas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);

        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double circunferenciaCirculo = 2 * Math.PI * radio;

        System.out.printf("Rectángulo - Área:        %.2f%n", areaRectangulo);
        System.out.printf("Rectángulo - Perímetro:   %.2f%n", perimetroRectangulo);
        System.out.printf("Círculo    - Área:        %.2f%n", areaCirculo);
        System.out.printf("Círculo    - Circunferencia: %.2f%n", circunferenciaCirculo);

        scanner.close();
    }
}