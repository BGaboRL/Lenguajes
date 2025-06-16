
import java.util.ArrayList;
import java.util.List;



public class BitsDeBinario {
    public static void main(String[] args) {
        int n = 161;
        String nb = Integer.toBinaryString(n);
        int bits = 0;
        List<Integer> posicion = new ArrayList<>();

        for (int i = 0; i < nb.length(); i++) {
            if(nb.charAt(i) == '1'){
                bits++;
                posicion.add(i+1);
            }
        }
        
        posicion.addFirst(bits);
        System.out.println(posicion);
    }

}
