class Solution {

    public void swap(int i1,int j1,int i2,int j2,int[][] matrix){
        int temp = matrix[i1][j1];
        matrix[i1][j1]=matrix[i2][j2];
        matrix[i2][j2]=temp;
    }

    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j)break;
                swap(i,j,j,i,matrix);
            }
        }
        int start = 0;
        int end=matrix[0].length-1;
        while(start<end){
            for(int i=0;i<matrix.length;i++){
                swap(i,start,i,end,matrix);
            }
            start++;
            end--;
        }

    }
}