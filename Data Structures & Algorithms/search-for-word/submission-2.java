class Solution {
    public boolean dfs(char[][] board, String word, boolean[][] visited, int i, int j, int idx){
        int r = board.length, c = board[0].length;
        if(idx==word.length()){
            return true;
        }
        if(i<0 || i>=r || j<0 || j>=c 
            || visited[i][j] || board[i][j]!=word.charAt(idx)){
            return false;
        }
        visited[i][j] = true;
        // move down
        if(dfs(board, word, visited, i+1, j, idx+1)){
            return true;
        }
        // move right
        if(dfs(board, word, visited, i, j+1, idx+1)){
            return true;
        }
        // Move up
        if(dfs(board, word, visited, i-1, j, idx+1)){
            return true;
        }
        // Move left
        if(dfs(board, word, visited, i, j-1, idx+1)){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int r = board.length, c = board[0].length;
        boolean[][] visited = new boolean[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(board[i][j]==word.charAt(0) && dfs(board, word, visited, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
}
