import java.util.Arrays;
import java.util.Scanner;

public class PiramideAsterisco {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Numero de pisos: ");
        int pisos = Sc.nextInt();
        System.out.println();

        piramide(pisos);
        System.out.println(Arrays.toString((piramide2(pisos)))); 

        Sc.close();
    }

    public static void piramide (int pisos) {
        int a = 0;
        int b = pisos;

        for (int i = 0; i < pisos; i++) {               //     *
            a += 1;                                     //    ***
            for (int j = a; j < pisos; j++) {           //   *****
                System.out.print(" ");                  //  *******
            }                                           // *********
            
            for (int k = pisos; k <= b; k++) {
                System.out.print("*");
            }
            b += 2;
            System.out.println();
        }
    }

    public static String[] piramide2 (int pisos) {      //  [    *    ,    ***   ,   *****  ,  ******* , *********]
        int b = pisos;
        int a = 0;
        String[] pir = new String[pisos];

        for (int i = 0; i < pisos; i++) {
            String pira = "";
            a += 1;
            for (int j = a; j < pisos; j++) {
                pira += " ";           
            }

            for (int k = pisos; k <= b; k++) {
                pira += "*";           
            }

            for (int l = a; l < pisos; l++) {
                pira += " ";           
            }

            b += 2;
            pir[i] = pira;
        }

        return pir;
    }
}
