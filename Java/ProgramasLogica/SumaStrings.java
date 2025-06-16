//Suma de dos numeros enteros de tipo String del tamaño que sea sin usar BigIntegr o BigDecimal
import java.util.Scanner;

public class SumaStrings{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Cadena 1:");
        String a = Sc.next();
        System.out.println("Cadena 2:");
        String b = Sc.next();

        System.out.println(suma(a, b));
        //suma(a,b);
        Sc.close();
        System.exit(0);
    }

    public static String suma (String x, String y){
        int []na = new int[x.length()];
        int []nb = new int[y.length()];

        //Coloca los string en arreglos de tipo int
        for (int i = 0; i < na.length; i++) {
            na[i] = Character.getNumericValue(x.charAt(i));
        }
        for (int j = 0; j < nb.length; j++) {
            nb[j] = Character.getNumericValue(y.charAt(j));
        }

        //Rellena los espacios en blanco con ceros de ser necesario
        int max = Math.max(na.length, nb.length);
        int []na2 = new int[max];
        int []nb2 = new int[max];

        int p = 0;
        for (int i = (max-1)-(na.length-1); i < max; i++) {
            na2[i] = na[p];
            p++;
        }
        p = 0;
        for (int j = (max-1)-(nb.length-1); j < max; j++) {
            nb2[j] = nb[p];
            p++;
        }

        //Sumar los datos
        int[] suma = new int[max];
        int decena = 0;
        for (int k = max-1; k >= 0; k--) {
            int sum = na2[k] + nb2[k] + decena;
            if(sum > 9){
                suma[k] = sum - 10;
                decena = 1;
            }
            else{
                suma[k] = sum;
                decena = 0;
            }
        }
        
        String sumaString = "";
        //Si la suma tiene un numero volando, este se agrega
        //Se convierte el arreglo a cadena
        if(decena != 0){
            int[] fin = new int[max + 1];
            fin[0] = 1;
            System.arraycopy(suma, 0, fin, 1, suma.length);
            //Origen, posicion a empezar a copiar, destino, posicion desde se empesara a copiar, cantidad de datos que se van a copiar

            for (int i = 0; i <= max; i++) {
                sumaString += String.valueOf(fin[i]);
            }
        }
        else{
            int[] fin = new int[max];
            System.arraycopy(suma, 0, fin, 0, suma.length);

            for (int i = 0; i < max; i++) {
                sumaString += String.valueOf(fin[i]);
            }
        }

        if(sumaString.startsWith("0")){
            sumaString = sumaString.substring(1);
        }

        return sumaString;
    }
}