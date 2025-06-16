import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InviertePalabras {
    public static void main(String[] args) {
        List<String> forma1 = new ArrayList<>();
        String forma2 = " ";
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa una frase: ");
            String frase = sc.nextLine();

            String[] divicion = frase.split(" ");

            for (String palabra : divicion) {
                String invertido = new StringBuilder(palabra).reverse().toString();
                forma1.add(0, " " + invertido);
                forma2 += invertido + " ";
            }

            System.out.println(forma1);
            System.out.println(forma2);
        }
    }
}
