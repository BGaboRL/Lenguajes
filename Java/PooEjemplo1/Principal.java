import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el limite de la tarjeta:");
        double limite = sc.nextDouble();
        TarjetaCredito tarjeta = new TarjetaCredito(limite);

        int salir = 1;
        while (salir != 0){
            System.out.println("Escriba la descripción de la compra:");
            String desc = sc.next();

            System.out.println("Escriba el valor de la compra:");
            double valor = sc.nextDouble();

            Compras compra = new Compras(valor, desc);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("************************************");
        System.out.println("COMPRAS REALIZADAS:");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Compras compra : tarjeta.getListaDeCompras()){
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("*************************************");
        System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());
    }
}
