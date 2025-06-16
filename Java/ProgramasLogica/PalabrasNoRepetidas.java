import java.util.Scanner;

public class PalabrasNoRepetidas {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingresa Una palabra:");
        String pal = Sc.next(); //streSS

        if (pal.isBlank()){
            System.out.println("");
        }
        else{
            //System.out.println(pal);
            int tam = pal.length();
            String uno = String.valueOf(pal.charAt(0));
            String dos = "";
            boolean noRepite = false;

            fori:
            for (int i = 0; i < tam; i++) {
                dos = "";

                forj:
                for (int j = 0; j < tam; j++) {
                    if (i == j) {
                        continue forj;
                    } else {
                        String si = String.valueOf(pal.charAt(i));
                        String si2 = String.valueOf(pal.charAt(j));
                        if (  si.equalsIgnoreCase(si2) ) {
                            uno = dos;
                            noRepite = false;
                            continue fori;
                        } else {
                            uno = String.valueOf(pal.charAt(i));
                            noRepite = true;
                        }
                    }
                }
                if (noRepite) {
                    break;
                }
            }
            //String no = String.valueOf(uno);
            System.out.println(uno);
        }
        
        Sc.close();
    }
}
