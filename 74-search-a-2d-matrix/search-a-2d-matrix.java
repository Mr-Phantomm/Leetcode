class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = (matrix.length*matrix[0].length)-1;
        while(start<=end){
            int mid = (end-start)/2+start;
            // System.out.println(start+" "+end);
            // System.out.println(mid/matrix.length+" "+mid%matrix.length);
            int curr = matrix[mid/matrix[0].length][mid%matrix[0].length];
            if(target==curr)return true;
            else if(curr<target){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return false;
    }
}