import java.util.Scanner;

public class uno{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = 0;

        for(int i = 0; i <= a; i++){
            b = b+i;
        }
        System.out.println(b);
    }
}

/**
import java.util.Scanner;

public class uno{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int a = Sc.nextInt();
        int b = 0;

        if (a <= 0){
            System.out.println("Error");
        }
        else{
            for(int i = 0; i < a; i++){
                int c = Sc.nextInt();
                b = b+c;
            }
            System.out.println(b);
        }

        Sc.close();
    }
}
*/
