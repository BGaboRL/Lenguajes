public class TicTackToeCheck {
    public static void main(String args[]){
        int[][] numeros = { {0, 2, 1}, {2, 1, 0}, {1, 2, 1 }};
        System.out.println(soulucion(numeros));
        
    }

    public static int soulucion(int[][] board){
        int sol = 0;
        boolean find = false;
        
        for (int i = 0; i < 3; i++) {
            if((board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1) ||
            (board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1)){
                sol = 1;
                find = true;
                break;
            }
            else if((board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2) || 
            (board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 2)){
                sol = 2;
                find = true;
                break;
            }
        }

        if(!find){
            if((board[0][0] == 1 && board[1][1] == 1 & board[2][2] == 1) || 
            (board[0][2] == 1 && board[1][1] == 1 & board[2][0] == 1)){
                sol = 1;
                find = true;
            }
            else if((board[0][0] == 2 && board[1][1] == 2 & board[2][2] == 2) || 
            (board[0][2] == 2 && board[1][1] == 2 & board[2][0] == 2)){
                sol = 2;
                find = true;
            }
        }

        if(!find){
            for (int i = 0; i < 3; i++) {
                if((board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 0) ||
                (board[i][0] == 1 && board[i][1] == 0 && board[i][2] == 1) ||
                (board[i][0] == 0 && board[i][1] == 1 && board[i][2] == 1)){
                    sol = -1;
                    find = true;
                    break;
                }
                else if ((board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 0) || 
                (board[0][i] == 1 && board[1][i] == 0 && board[2][i] == 1) ||
                (board[0][i] == 0 && board[1][i] == 1 && board[2][i] == 1)) {
                    sol = -1;
                    find = true;
                    break;
                }
                else if((board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 0) ||
                (board[i][0] == 2 && board[i][1] == 0 && board[i][2] == 2) ||
                (board[i][0] == 0 && board[i][1] == 2 && board[i][2] == 2)){
                    sol = -1;
                    find = true;
                    break;
                }
                else if((board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 0) ||
                (board[0][i] == 2 && board[1][i] == 0 && board[2][i] == 2) ||
                (board[0][i] == 0 && board[1][i] == 2 && board[2][i] == 2)){
                    sol = -1;
                    find = true;
                    break;
                }
            }
        }

        if(!find){
            if ((board[0][0] == 0 && board[1][1] == 1 & board[2][2] == 1) || 
            (board[0][2] == 0 && board[1][1] == 1 & board[2][0] == 1) ||
            (board[0][0] == 1 && board[1][1] == 0 & board[2][2] == 1) || 
            (board[0][2] == 1 && board[1][1] == 0 & board[2][0] == 1) ||
            (board[0][0] == 1 && board[1][1] == 1 & board[2][2] == 0) || 
            (board[0][2] == 1 && board[1][1] == 1 & board[2][0] == 0)) {
                sol = -1;                
            }
            else if ((board[0][0] == 0 && board[1][1] == 2 & board[2][2] == 2) || 
            (board[0][2] == 0 && board[1][1] == 2 & board[2][0] == 2) ||
            (board[0][0] == 2 && board[1][1] == 0 & board[2][2] == 2) || 
            (board[0][2] == 2 && board[1][1] == 0 & board[2][0] == 2) ||
            (board[0][0] == 2 && board[1][1] == 2 & board[2][2] == 0) || 
            (board[0][2] == 2 && board[1][1] == 2 & board[2][0] == 0)) {
                sol = -1;                
            }
            else{
                int cero = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        if(board[i][j] == 0){
                            cero++;
                        }
                    }
                }
                if(cero == 0){
                    sol = 0;
                }
                else{
                    sol = -1;
                }
            }
        }

        return sol;
    }
}
