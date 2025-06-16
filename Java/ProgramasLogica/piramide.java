//##################################################    Invierte palabras
public class piramide{
    public static void main(String[] args) {
        

        String a = "Tres peso";
        String b = "";
        for (int i = a.length()-1; i >= 0; i--) {
            b += a.charAt(i);
        }
        System.out.println(b);

//##################################################    Fibonacci
//        int a = 0;
//        int b = 1;
//        int c = 0;
//
//        System.out.print(a + " " + b);
//        for (int i = 0; i < 10; i++) {
//            c = a+b;
//            a = b;
//            b = c;
//            c = 0;
//            System.out.print(" " + b);
//        }
//        System.out.println();

//##################################################    Piramide
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Pisos:");
//        int b = Sc.nextInt();
//        int a = 1;
//        int c = 1;
//        for (int i = 0; i < b; i++) {
//            for (int k = c; k < b; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < a; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            a+=2;
//            c++;
//        }
    }
}
