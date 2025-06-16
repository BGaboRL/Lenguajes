public class SumaDeIntervalos {
    public static void main(String[] args){
        int[][] intervalos = {{1,2}
                            ,{6,10}
                            ,{11,15}};

        for (int[] intervalo : intervalos) {
            for (int j = 0; j < intervalos.length; j++) {
                System.out.println(intervalo[j]);
            }
        }
    }
}