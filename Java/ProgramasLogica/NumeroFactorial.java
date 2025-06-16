
import java.math.BigInteger;
import java.util.Scanner;

public class NumeroFactorial {

    public static String Factorial(int n) {
        if (n > 0) {
            BigInteger nF = BigInteger.ONE;     //BigInteger inicializado con el valor 1
            for (int i = 1; i <= n; i++) {
                nF = nF.multiply(BigInteger.valueOf(i));
            }

            String f = nF.toString();
            return f;
        }
        else if (n < 0){
            return null;
        }
        else{
            return "1";
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int n = Sc.nextInt();

        System.out.println(Factorial(n));
        Sc.close();
    }

}
