import java.util.Scanner;

public class SepararDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        String numTexto = String.valueOf(numero);


        System.out.println("Dígitos separados:");

        for (int i = 0; i < numTexto.length(); i++) {
            System.out.print(numTexto.charAt(i) + " ");
        }

        scanner.close();
    }
}