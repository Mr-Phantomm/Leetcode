class Solution {

    public boolean solve(int i,int j,char[][] board,Map<Integer,Set<Character>> row,Map<Integer,Set<Character>> column,Map<Integer,Set<Character>> box){
        if(i==9)return true;
        int nextI=(j==8)?i+1:i;
        int nextJ=(j==8)?0:j+1;

        if(board[i][j]!='.'){
            return solve(nextI,nextJ,board,row,column,box);
        }   


        int boxNumber=(i/3)*3+(j/3);
        Set<Character> currRow=row.get(i);
        Set<Character> currCol=column.get(j);
        Set<Character> currBox=box.get(boxNumber);

        for(char ch='1';ch<='9';ch++){
            if(!currRow.contains(ch)&&!currCol.contains(ch)&&!currBox.contains(ch)){
                board[i][j]=ch;
                currRow.add(ch);
                currCol.add(ch);
                currBox.add(ch);
                if(solve(nextI,nextJ,board,row,column,box))return true;
                board[i][j]='.';
                currRow.remove(ch);
                currCol.remove(ch);
                currBox.remove(ch);
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        
        // Data Structure Initialize
        
        Map<Integer,Set<Character>> row = new HashMap<>();
        Map<Integer,Set<Character>> column=new HashMap<>();
        Map<Integer,Set<Character>> box=new HashMap<>();
        
        // Data Structure filler 
        
        for(int i=0;i<9;i++){
            row.put(i,new HashSet<>());
            column.put(i,new HashSet<>());
            box.put(i,new HashSet<>());
        } 
        
        //Traversal and DATA INPUT   
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                row.get(i).add(board[i][j]);
                column.get(j).add(board[i][j]);
                int boxIndex=(i/3)*3+(j/3);
                box.get(boxIndex).add(board[i][j]);                  
            }
        }
        
        solve(0,0,board,row,column,box);
        

        
        
        // int boxIndex=
        // ["5","3",".",".","7",".",".",".","."],
        // ["6",".",".","1","9","5",".",".","."],
        // [".","9","8",".",".",".",".","6","."],
        // ["8",".",".",".","6",".",".",".","3"],
        // ["4",".",".","8",".","3",".",".","1"],
        // ["7",".",".",".","2",".",".",".","6"],
        // [".","6",".",".",".",".","2","8","."],
        // [".",".",".","4","1","9",".",".","5"],
        // [".",".",".",".","8",".",".","7","9"],
    }
}