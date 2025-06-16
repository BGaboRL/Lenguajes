//Entre 0 y un numero ingresado busca los multiplos de 3 y 5 y los suma

import java.util.Scanner;

public class MultiplosDe3Y5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int num = Sc.nextInt();

        int mul = 0;

        for (int i = 0; i < num; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)){
                mul += i;
            }
        }

        System.out.println("Suma de los multiplos de 3 y 5: " + mul);

        Sc.close();
    }
    
}
