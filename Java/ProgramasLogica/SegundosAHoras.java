import java.util.Scanner;

public class SegundosAHoras {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingresa los segundos:");   
        int segundos = Sc.nextInt();

        if (segundos > 359999){
            System.out.println("Ingresa un numero valido!\n");
            main(args);
        }
        else{
            System.out.println(convercion(segundos));
            System.exit(0);
        }
        
        Sc.close();
    }

    public static String convercion(int segundos) {
        int h = 0, m = 0;
        String ho = "00", mi = "00", se = "00";
        int[] hora = {/*86400*/359999, 3600, 60};

        while (segundos >= hora[1]){
            segundos -= hora[1];
            h++;

            if (h < 10){ ho = "0" + h; }
            else{ ho = Integer.toString(h); }
        }

        while (segundos >= hora[2]){
            segundos -= hora[2];
            m++;

            if (m < 10){ mi = "0" + m; }
            else{ mi = Integer.toString(m); }
        }

        if (segundos < 10){ se = "0" + segundos; }
        else{ se = Integer.toString(segundos); }

        String tiempo = ho + ":" + mi + ":" + se;

        return tiempo;
    }
}
