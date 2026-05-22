import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioColombia {
    public static void main(String[] args) {
        
        Locale localeCOP = new Locale("es", "CO");
        
        
        Scanner scanner = new Scanner(System.in).useLocale(localeCOP);

       
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

       
        System.out.print("Ingrese el valor de la hora ($): ");
        double valorHora = scanner.nextDouble();

       
        double salarioBruto = horasTrabajadas * valorHora;
        double descuentoSS = salarioBruto * 0.08;      
        double retencionFuente = salarioBruto * 0.05;  
        double salarioNeto = salarioBruto - descuentoSS - retencionFuente;

        
        System.out.println("\n--- DESCRIPCIÓN DE PAGO (COP) ---");
        System.out.printf(localeCOP, "Empleado:           %s%n", nombre);
        System.out.printf(localeCOP, "Horas trabajadas:   %d%n", horasTrabajadas);
        System.out.printf(localeCOP, "Salario bruto:      $ %,.2f%n", salarioBruto);
        System.out.printf(localeCOP, "Descuento SS (8%%):  $ %,.2f%n", descuentoSS);
        System.out.printf(localeCOP, "Retención (5%%):     $ %,.2f%n", retencionFuente);
        System.out.printf(localeCOP, "Salario neto:       $ %,.2f%n", salarioNeto);

        scanner.close();
    }
}