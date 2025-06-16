public class RegresarAlMismoPunto{
    public static void main(String[] args) {
        char[] camino = {'n','n','n','s','n','s','n','s','n','s'};

        System.out.println(siono(camino));
    }

    public static boolean siono(char[] walk){
        int x = 0, y = 0;
        boolean inicio;

        if (walk.length > 10 || walk.length <10){
            inicio = false;
        }
        else{
            for (int i = 0; i < walk.length; i++) {
                if(walk[i] == 'n'){y++;}
                else if(walk[i] == 's'){y--;}
                else if(walk[i] == 'e'){x++;}
                else if(walk[i] == 'w'){x--;}
            }
            if(x == 0 && y == 0){inicio = true;}
            else{inicio = false;}
        }

        return inicio;
    }
}