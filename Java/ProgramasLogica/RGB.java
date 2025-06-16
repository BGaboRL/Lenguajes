
import java.util.Scanner;

public class RGB{
    public static String rgb(int r, int g, int b){
        int[] rgb = {r,g,b};
        String rgbh = "";

        for (int i = 0; i < 3; i++) {
            String rgbS = "";

            if (rgb[i] > 255){
                rgb[i] = 255;
                rgbS = Integer.toHexString(rgb[i]);
            } else if (rgb[i] < 0){
                rgb[i] = 0;
                rgbS = Integer.toHexString(rgb[i]);
            } else {
                rgbS = Integer.toHexString(rgb[i]);
                if(rgb[i] < 10){
                    rgbS = "0".concat(rgbS);
                }
            }
            rgbh += rgbS;
        }
        return rgbh.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int r, g, b;
        
        System.out.print("R: ");
        r = Sc.nextInt();
        System.out.print("G: ");
        g = Sc.nextInt();
        System.out.print("B: ");
        b = Sc.nextInt();

        System.out.println(rgb(r, g, b));

        Sc.close();
    }
}