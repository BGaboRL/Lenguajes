import java.util.Scanner;

public class NumerosRomanos {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entre 1-3999");
        int num = Sc.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("Numero invalido!");
        } else {
            System.out.println(romano(num));
        }

        Sc.close();
    }

    public static String romano(int normal){
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String roma = "";
    
        for (int i = 0; i < valores.length; i++) {
            while (normal >= valores[i]) {
                normal -= valores[i];
                roma += simbol[i];
            }
        }
        return roma;
    }
}

