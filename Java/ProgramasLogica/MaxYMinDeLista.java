//import java.util.Scanner;

public class MaxYMinDeLista {
    public static void main(String[] args) {
//////////////////// Lista ingresada o dada /////////////////////////////////////////////////////////////////
        String maxymin = "-1 -2 -3 -4 -5";
        String [] maxymin2 = maxymin.split(" ");
        int num = 0;

        int max = Integer.parseInt(maxymin2[0]);
        int min = Integer.parseInt(maxymin2[0]);//maxymin.charAt(0);

        for (int i = 0; i < maxymin2.length; i++){
            num = Integer.parseInt(maxymin2[i]);
            if (num > max){
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println(Integer.toString(max) + " " + Integer.toString(min));


//////////////////////////Lista ingresada por teclado ////////////////////////////////////////////////////////
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int temp = teclado.nextInt();

        int numero = 0;
        int numeroMayor = temp; //el primer valor se lo asignas al mayor
        int numeroMenor = temp; //y al menor, de esta forma evitas comenzar con 0

        for (int i = 0; i < 4; i++) {

            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();

            if(numero > numeroMayor){
                numeroMayor = numero;
            }

            if(numero < numeroMenor){
                numeroMenor = numero;
            }  
        }

        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);

        teclado.close();
         */
    }
    
}
