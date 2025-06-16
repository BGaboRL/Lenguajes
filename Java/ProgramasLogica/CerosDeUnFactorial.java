
import java.util.Scanner;

public class CerosDeUnFactorial {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingresa un entero: ");
        int a = Sc.nextInt();
        long ab = 1;

        for (int i = a; i > 0 ; i--) {
            ab *= i;
        }
        if(a == 0){ab = 0;}

        System.out.println("Factorial de " + a + ": " + ab);
        System.out.println("Ceros finales: " + zeros(ab));

        Sc.close();
        System.exit(0);
    }
    
    public static int zeros (long n) {
        int conteoCeros = 0;

        // Contar cuántos múltiplos de 5 hay en el rango de 1 a n
        while (n >= 5) {
            n /= 5;
            conteoCeros += n;
        }
        
        return conteoCeros;
        
        /*
        String f = Long.toString(n);
        char[] fa = new char[f.length()];
        int cero = 0;

        for (int i = 0; i < f.length(); i++) {
            fa[i] = f.charAt(i);
            if (fa[i] == '0'){
                cero++;
            }
            else{
                cero = 0;
            }
        }
        return cero;
         */
    }
}
