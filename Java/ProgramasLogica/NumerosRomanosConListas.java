import java.util.ArrayList;
import java.util.List;

public class NumerosRomanosConListas {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<String> romanos = new ArrayList<>();

        for(Integer n : numbers){
            int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] simbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            String romano = "";
    
            for (int i = 0; i < valores.length; i++) {
                while (n >= valores[i]) {
                    n -= valores[i];
                    romano += simbol[i];
                }
            }
        romanos.add(romano);
        }

        System.out.println(romanos);
    }
}
