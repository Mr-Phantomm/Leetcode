class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum =Integer.MIN_VALUE ;
        int left= 0;
        int right = k>=2?k-1:0;
        int currSum =0;
        for(int i=0;i<k-1;i++){
            currSum += nums[i];
        }
        
        while(right<nums.length){
            currSum += nums[right];
            // System.out.println(currSum);
            maxSum = Math.max(maxSum,currSum);
            currSum -= nums[left];
            left++;
            right++;
        }
        return ((double)maxSum)/k;
    }
}