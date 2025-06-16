public class ConvertirAFormaCamello{
    public static void main(String[] args) {
        String frase1 = "the-stealth-warrior";
        String frase2 = "stealth_the_warrior";
        String frase3 = "warrior_the-stealth";

        System.out.println("Frase 1: " + camello(frase1));
        System.out.println("Frase 2: " + camello(frase2));
        System.out.println("Frase 3: " + camello(frase3));
    }

    public static String camello (String frase){
        String[] a = frase.split("[-, _]");
        int x = a.length;
        String cam1, cam2, cam3;
        String camello = "";

        for (int i = 0; i < x; i++) {
            cam1 = (a[i].substring(0, 1).toUpperCase());
            cam2 = (a[i].substring(1)).toLowerCase();
            cam3 = cam1.concat(cam2);
            camello += cam3;
        }

        return camello;
    }
}