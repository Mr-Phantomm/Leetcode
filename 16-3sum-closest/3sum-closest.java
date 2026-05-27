class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(sum==target)return sum;
                else if(sum<target){
                    start++;
                }
                else{
                    end--;
                }
                int diff = Math.abs(target-sum);
                int diffAlready = Math.abs(target-closestSum);
                closestSum = diff<diffAlready?sum:closestSum;

            }
        }
        return closestSum;
    }
}