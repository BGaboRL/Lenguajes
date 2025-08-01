//2 = t

//0 2 10 = a b n
//Resultado = 2 6 14 30 62 126 254 510 1022 2046

//5 3 5 = a b n
//Resultado = 8 14 26 50 98

import java.util.Scanner;

public class SecuenciaQABN{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int re = a + ((int) Math.pow(2,0) * b);
            
            for (int j = 1; j <= n; j++){
                System.out.print(re + " ");
                re += Math.pow(2, j) * b;
            }
            System.out.println();
        }
        in.close();
    }
}