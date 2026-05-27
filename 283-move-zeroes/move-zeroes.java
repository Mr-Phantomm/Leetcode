class Solution {
    public void moveZeroes(int[] nums) {
                
        int positionToPut = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[positionToPut++]=nums[i];
            }
        }
        while(positionToPut<nums.length){
            nums[positionToPut++]=0;
        }

    }
}