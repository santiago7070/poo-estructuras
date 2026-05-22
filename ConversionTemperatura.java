import java.util.Locale;
import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

       
        System.out.printf("Celsius:    %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin:     %.2f K%n", kelvin);

        scanner.close();
    }
}