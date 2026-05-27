class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int currWindowSum = 0;
        int windowSize = nums.length+1;
        while(right<nums.length){
            currWindowSum += nums[right];
            if(currWindowSum>=target){
                while(currWindowSum>=target){
                    int currWindowSize = right-left+1;
                    windowSize = Math.min(windowSize,currWindowSize);
                    currWindowSum -= nums[left];
                    left++;
                }
            }
            right++;
        }
        return windowSize==nums.length+1?0:windowSize;
    }
}