public class PalabraMasLarga {
    public static void main(String[] args) {
        String sen = "I love dogs";
        int l = 0;
        String m = "";
        for (String s : sen.split(" ")){
            int x = 0;
            for (int i = 0; i < s.length(); i++) {
                char letra = s.charAt(i);
                if (Character.isLetter(letra)){
                    x++;
                }
            }
            if (x > l){
                l = s.length();
                m = s;
            }
        }
        System.out.println(m);
    }
}
