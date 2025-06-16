import java.util.Scanner;

import javax.swing.*;

public class SinVocales {
    /*
    public static String vocales (String frase){
        return frase.replaceAll("[aAeEiIoOuU]", "");
    }
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = JOptionPane.showInputDialog(null, "Ingresa una frase: ");
        //System.out.println("Ingresa una frase:");
        //String fras = teclado.nextLine();

        //String SinVocales = vocales(fras);
        //System.out.println("Sin vocales es:\n" + SinVocales);
        String fraseSinVocales = "Sin vocales: " + frase.replaceAll("[AaEeIiOoUu]", "");
        JOptionPane.showMessageDialog(null, fraseSinVocales);

        teclado.close();
    }
}
