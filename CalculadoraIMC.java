import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner fl = new Scanner(System.in);

        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = fl.nextDouble();

        System.out.print("Ingrese la estatura en metros: ");
        double estatura = fl.nextDouble();

        double imc = peso / Math.pow(estatura, 2);

        System.out.printf("Su IMC es: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Categoría: Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Categoría: Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Categoría: Sobrepeso");
        } else {
            System.out.println("Categoría: Obesidad");
        }

        fl.close();
    }
}
