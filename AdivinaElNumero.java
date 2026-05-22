import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        int intentosContador = 0;

        System.out.println("Adivina el número (entre 1 y 100):");

        while (intento != numeroSecreto) {
            intentosContador++;
            System.out.printf("Intento %d: ", intentosContador);
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("→ El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("→ El número es menor.");
            } else {
                System.out.printf("¡Correcto! Lo lograste en %d intentos.%n", intentosContador);
            }
        }

        scanner.close();
    }
}