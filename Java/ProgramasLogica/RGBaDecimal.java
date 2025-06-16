
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RGBaDecimal {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingresa el valor RGB:");
        String rgb = Sc.next();
        
        Map<String, Integer> map = mapa(rgb);
        
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + ": " + en.getValue());
            
        }
        Sc.close();
    }

    public static Map<String, Integer> mapa (String rgb){
        int r = Integer.parseInt((rgb.substring(1,3)), 16);
        int g = Integer.parseInt((rgb.substring(3,5)), 16);
        int b = Integer.parseInt((rgb.substring(5)), 16);

        //System.out.println(r + " " + g + " " + b);
        Map<String, Integer> mapaRGB = new LinkedHashMap<>();
        mapaRGB.put("r", r);
        mapaRGB.put("g", g);
        mapaRGB.put("b", b);

        return mapaRGB;
    }
}
