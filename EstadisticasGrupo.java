import java.util.Scanner;

public class EstadisticasGrupo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Ingrese la nota del estudiante %d: ", (i + 1));
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / notas.length;
        
        double notaAlta = notas[0];
        int indiceAlta = 0;
        double notaBaja = notas[0];
        int indiceBaja = 0;
        
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
                indiceAlta = i;
            }
            if (notas[i] < notaBaja) {
                notaBaja = notas[i];
                indiceBaja = i;
            }
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.printf("%nPromedio del grupo: %.2f%n", promedio);
        System.out.printf("Nota más alta: %.2f (Índice: %d)%n", notaAlta, indiceAlta);
        System.out.printf("Nota más baja: %.2f (Índice: %d)%n", notaBaja, indiceBaja);
        System.out.printf("Estudiantes aprobados: %d%n", aprobados);
        System.out.printf("Estudiantes reprobados: %d%n", reprobados);

        scanner.close();
    }
}