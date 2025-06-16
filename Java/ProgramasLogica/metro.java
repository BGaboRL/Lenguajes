import java.util.Scanner;

public class metro {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];

        Scanner scanner = new Scanner(System.in);

        // Agregar elementos a la matriz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Sumar los elementos del primer elemento
        int sumaPrimerElemento = 0;
        for (int j = 0; j < 6; j++) {
            sumaPrimerElemento += matriz[0][j];
        }

        // Restar los elementos del segundo elemento
        int restaSegundoElemento = 0;
        for (int j = 0; j < 6; j++) {
            restaSegundoElemento -= matriz[1][j];
        }

        // Mostrar los resultados
        System.out.println("La suma de los elementos del primer elemento es: " + sumaPrimerElemento);
        System.out.println("La resta de los elementos del segundo elemento es: " + restaSegundoElemento);

        scanner.close();
    }
}
