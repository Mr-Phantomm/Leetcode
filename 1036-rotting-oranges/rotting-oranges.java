// class Solution {
//     public class Node{
//         int i;
//         int j;
//         Node(int i,int j){
//             this.i=i;
//             this.j=j;
//         }
//     }
//     public int orangesRotting(int[][] grid) {
//         Queue<Node> queue = new LinkedList<>();
//         int noOf1 = 0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==2){
//                     queue.offer(new Node(i,j));
//                     noOf1++;
//                 }
//                 if(grid[i][j]==1){
//                     noOf1++;
//                 }
//             }
//         }
//         if(noOf1==0)return 0;
//         queue.offer(null);
//         int count = 0;
//         boolean[][] visited = new boolean[grid.length][grid[0].length];
//         while(!queue.isEmpty()){
//             Node curr = queue.poll();
//             if(curr==null){
//                 if(queue.isEmpty())break;
//                 queue.offer(null);
//                 count++;
//                 continue;
//             }
//             int i = curr.i;
//             int j = curr.j;
//             if(i<0||j<0||i>=grid.length||j>=grid[0].length||visited[i][j]||grid[i][j]==0)continue;
//             visited[i][j]=true;
//             grid[i][j]=2;
//             noOf1--;
//             queue.offer(new Node(i-1,j));
//             queue.offer(new Node(i+1,j));
//             queue.offer(new Node(i,j-1));
//             queue.offer(new Node(i,j+1));
//         }

//         return noOf1==0?count-1:-1;
        
//     }
// }

class Solution {
    public int orangesRotting(int[][] grid) {
        class Node{
        int i ;
        int j;
        Node(int i, int j){
            this.i = i;
            this.j = j;
        }
        // public String toString(){
        //     return ""+i+" "+j;
        // }
        }
        int fresh =0;
        int steps =0;
        Queue<Node> q= new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    q.offer(new Node(i,j));
                    //visited[i][j]=true;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        //System.out.println(fresh);
        if(fresh==0)return 0;
        q.offer(null);
        while(!q.isEmpty()){
            //System.out.println(q);
            Node curr = q.poll();
            if(curr==null){
            if(q.isEmpty())break;
            steps++;
            q.offer(null);
            continue;
            }

            if(curr.i<0|| curr.j<0 || curr.i>=grid.length || curr.j>=grid[0].length ||visited[curr.i][curr.j]|| grid[curr.i][curr.j]==0)continue;
            visited[curr.i][curr.j]=true;
            if(grid[curr.i][curr.j]==1){
                grid[curr.i][curr.j]=2;
                fresh--;
            }
            if(fresh==0)return steps;
            q.offer(new Node(curr.i+1, curr.j));
            q.offer(new Node(curr.i-1, curr.j));
            q.offer(new Node(curr.i, curr.j+1));
            q.offer(new Node(curr.i, curr.j-1));

        }
        return -1;

    }

    
}