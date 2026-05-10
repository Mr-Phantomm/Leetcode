class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        if(nums[0]==0)return false;
        int prev = nums[0];
        for(int i=1;i<nums.length-1;i++){
            int num = nums[i];
            prev--;
            prev = Math.max(prev,num);
            if(prev==0)return false;
        }
        return true;
    }
}