//Maneja cantidades enteras enormes

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialDeCuadrados {
    public static BigInteger perimetro(BigInteger n){
        int nn = n.intValue();
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger x = BigInteger.ONE;
        BigInteger cuadrado = new BigInteger("4");

        for (int i = 0; i < nn; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
            x = x.add(c);
        }

        BigInteger p = x.multiply(cuadrado);

        return p;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingresa el perimetro: ");
        BigInteger p = Sc.nextBigInteger();
        System.out.println(perimetro(p));

        Sc.close();
    }
}
