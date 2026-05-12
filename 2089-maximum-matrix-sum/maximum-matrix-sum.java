class Solution {
    public long maxMatrixSum(int[][] matrix) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if(a<b)return -1;
            if(b<a)return 1;
            return 0;
        });

        long sum = 0;
        int numberOfNeg =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    numberOfNeg++;
                    pq.offer(-matrix[i][j]);
                    sum+= -matrix[i][j];
                }
                else{
                    pq.offer(matrix[i][j]);
                    sum+= matrix[i][j];
                }
            }
        }

        numberOfNeg%=2;

        while(numberOfNeg>0){
            sum-=2*pq.poll();
            numberOfNeg--;
        }

        return sum;

    }
}