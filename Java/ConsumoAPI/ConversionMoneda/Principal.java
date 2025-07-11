import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int valor = 0;
        ConsultaMoneda consulta = new ConsultaMoneda();

        System.out.println("*********************************");
        System.out.println("Conversor de moneda!");

        System.out.println("\n1) Dólar -> Peso Argentino");
        System.out.println("2) Peso Argentino -> Dólar");
        System.out.println("3) Dólar -> Real Brasileño");
        System.out.println("4) Real Brasileño -> Dólar");
        System.out.println("5) Dólar -> Peso Colombiano");
        System.out.println("6) Peso Colombiano -> Dólar");
        System.out.println("7) Salir");

        do{
            System.out.println("*********************************");
            System.out.println("\nElige una opción:");
            opc = sc.nextInt();
            if (opc != 7){
                System.out.println("Ingresa la cantidad que deseas convertir:");
                valor = sc.nextInt();
            }
            switch (opc){
                case 1 -> System.out.println(consulta.buscarmoneda("USD", "ARS", valor));
                case 2 -> System.out.println(consulta.buscarmoneda("ARS", "USD", valor));
                case 3 -> System.out.println(consulta.buscarmoneda("USD", "BRL", valor));
                case 4 -> System.out.println(consulta.buscarmoneda("BRL", "USD", valor));
                case 5 -> System.out.println(consulta.buscarmoneda("USD", "COP", valor));
                case 6 -> System.out.println(consulta.buscarmoneda("COP", "USD", valor));
                case 7 -> System.out.println("Nos vemos!");
                default -> System.out.println("Ingresa una opción valida!");
            }
        }while(opc != 7);
    }
}

