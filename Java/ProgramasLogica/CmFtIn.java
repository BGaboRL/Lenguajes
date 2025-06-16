//Programa que convierte centimetros a pies y pulgadas
import java.util.Scanner;

public class CmFtIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Centimetros: ");
        double cm = sc.nextDouble();

        final double CM_POR_PULGADAS = 2.54;
        final int PULGADAS_POR_PIE= 12;

        int pulgadas = (int) (cm / CM_POR_PULGADAS);
        int pies = pulgadas / PULGADAS_POR_PIE;
        int resto = pulgadas % PULGADAS_POR_PIE;

        System.out.printf("%.2f cm = %d pies, %d pulgadas \n", cm, pies, resto);

        sc.close();
    }
}
