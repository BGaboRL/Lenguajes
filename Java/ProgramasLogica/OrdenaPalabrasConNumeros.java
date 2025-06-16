public class OrdenaPalabrasConNumeros {
    public static void main(String[] args) {
        String texto = "is2 Thi1s T4est 3a";
        String [] texto2 = texto.split(" ");
        int t = texto2.length;
        String [] fin = new String[t];
        String f = "";

        if (texto.isBlank()){
            System.out.println(f);
        }
        else {
            for (int i = 0; i < t; i++){
                if (texto2[i].contains("1")){
                    fin[0] = texto2[i];
                } else if (texto2[i].contains("2")) {
                    fin[1] = texto2[i];
                } else if (texto2[i].contains("3")) {
                    fin[2] = texto2[i];
                } else if (texto2[i].contains("4")) {
                    fin[3] = texto2[i];
                } else if (texto2[i].contains("5")) {
                    fin[4] = texto2[i];
                } else if (texto2[i].contains("6")) {
                    fin[5] = texto2[i];
                } else if (texto2[i].contains("7")) {
                    fin[6] = texto2[i];
                } else if (texto2[i].contains("8")) {
                    fin[7] = texto2[i];
                } else if (texto2[i].contains("9")) {
                    fin[8] = texto2[i];
                }
            }

            String fraseOrdenada = "";

            for (int j = 0; j < fin.length; j++){
                fraseOrdenada += fin[j] + " ";
            }
            f = fraseOrdenada.trim();
        }
        System.out.println(f);
    }
}