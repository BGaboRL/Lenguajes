import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DoblementeLineal {
    public static void main(String[] args) {
        long uno = System.currentTimeMillis();

        Set<Integer> sinD = new TreeSet<>();
        sinD.add(1);
        List<Integer> nuevos = new ArrayList<>(sinD);
        int n = 1000;
        //int s = 1;
        for (int i = 0; i <= n * 1.2; i++) {
            if(i % 2 !=0){
                nuevos = new ArrayList<>(sinD);
            }
            int a = nuevos.get(i);
            int y = (2 * a) + 1;
            sinD.add(y);
            int x = (3 * a) + 1;
            sinD.add(x);
            //s += 2;
        }

        List<Integer> lista2 = new ArrayList<>(sinD);

        int r = lista2.get(n);
        System.out.println(r);
        long dos = System.currentTimeMillis();
        System.out.println(dos - uno);
    }
}
