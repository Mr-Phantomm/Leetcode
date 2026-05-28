class Solution {
    public int findMin(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(start<=end){
            System.out.println(start+" "+end);
            int mid = (end-start)/2+start;
            if(arr[mid]>=arr[start]){
                min = Math.min(min,arr[start]);
                start = mid+1;
            }else{
                min=Math.min(min,arr[mid]);
                end=mid-1;
            }
        }
        return min;
    }
}