import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        int jugadas = 0;

        while (!juegoTerminado) {
            System.out.println("\nTablero actual:");
            System.out.printf(" %c | %c | %c %n", tablero[0][0], tablero[0][1], tablero[0][2]);
            System.out.println("-----------");
            System.out.printf(" %c | %c | %c %n", tablero[1][0], tablero[1][1], tablero[1][2]);
            System.out.println("-----------");
            System.out.printf(" %c | %c | %c %n", tablero[2][0], tablero[2][1], tablero[2][2]);

            System.out.printf("%nJugador %c, ingrese fila (0-2) y columna (0-2) separados por un espacio: ", jugadorActual);
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Posición inválida. Intente de nuevo.");
                continue;
            }

            if (tablero[fila][columna] != ' ') {
                System.out.println("Esa celda ya está ocupada. Intente de nuevo.");
                continue;
            }

            tablero[fila][columna] = jugadorActual;
            jugadas++;

            boolean gano = false;
            for (int i = 0; i < 3; i++) {
                if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) gano = true;
                if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) gano = true;
            }
            if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) gano = true;
            if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) gano = true;

            if (gano) {
                System.out.println("\nTablero final:");
                System.out.printf(" %c | %c | %c %n", tablero[0][0], tablero[0][1], tablero[0][2]);
                System.out.println("-----------");
                System.out.printf(" %c | %c | %c %n", tablero[1][0], tablero[1][1], tablero[1][2]);
                System.out.println("-----------");
                System.out.printf(" %c | %c | %c %n", tablero[2][0], tablero[2][1], tablero[2][2]);
                System.out.printf("%n¡El jugador %c ha ganado el juego!%n", jugadorActual);
                juegoTerminado = true;
            } else if (jugadas == 9) {
                System.out.println("\nTablero final:");
                System.out.printf(" %c | %c | %c %n", tablero[0][0], tablero[0][1], tablero[0][2]);
                System.out.println("-----------");
                System.out.printf(" %c | %c | %c %n", tablero[1][0], tablero[1][1], tablero[1][2]);
                System.out.println("-----------");
                System.out.printf(" %c | %c | %c %n", tablero[2][0], tablero[2][1], tablero[2][2]);
                System.out.println("\n¡Es un empate! El tablero se ha llenado.");
                juegoTerminado = true;
            } else {
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }
}