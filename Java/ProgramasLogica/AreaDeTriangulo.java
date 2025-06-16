import java.util.Scanner;

public class AreaDeTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int altura = sc.nextInt();

        double area = (base * altura) / 2;

        System.out.printf("Case #1: %.2f", area);

        sc.close();
    }
    
}
