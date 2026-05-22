import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] ventas = new int[4][3];
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Ingrese ventas - Sucursal %d, Producto %d: ", (f + 1), (c + 1));
                ventas[f][c] = scanner.nextInt();
            }
        }

        int maxVenta = ventas[0][0];
        int sucursalMax = 1;
        int productoMax = 1;

        System.out.println("\n--- Ventas por sucursal ---");
        for (int f = 0; f < 4; f++) {
            int totalSucursal = 0;
            for (int c = 0; c < 3; c++) {
                totalSucursal += ventas[f][c];
                
                if (ventas[f][c] > maxVenta) {
                    maxVenta = ventas[f][c];
                    sucursalMax = f + 1;
                    productoMax = c + 1;
                }
            }
            System.out.printf("Sucursal %d: $ %d%n", (f + 1), totalSucursal);
        }

        System.out.println("\n--- Ventas por producto ---");
        for (int c = 0; c < 3; c++) {
            int totalProducto = 0;
            for (int f = 0; f < 4; f++) {
                totalProducto += ventas[f][c];
            }
            System.out.printf("Producto %d: $ %d%n", (c + 1), totalProducto);
        }

        System.out.println();
        System.out.printf("Venta más alta: $ %d (Sucursal %d, Producto %d)%n", maxVenta, sucursalMax, productoMax);

        scanner.close();
    }
}