class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][][] triplets = new boolean[3][3][9];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.')
                {
                    continue;
                }

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }

                int index = board[i][j]-'0'-1;

                if(rows[i][index]){
                    return false;
                }
                rows[i][index] = true;

                if(cols[j][index]){
                    return false;
                }
                cols[j][index] = true;
                
                if(triplets[i/3][j/3][index]){
                    return false;
                }            
                triplets[i/3][j/3][index] = true;
            }
        }
        return true;
    }
}
