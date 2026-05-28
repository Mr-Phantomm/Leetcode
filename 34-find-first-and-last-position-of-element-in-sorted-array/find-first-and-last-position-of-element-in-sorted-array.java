class Solution {

    public int firstPos(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int ans =-1;
        while(start<=end){
            int mid = (end-start)/2+start;
            if(nums[mid]==target){
                ans = mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public int lastPos(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int ans =-1;
        while(start<=end){
            int mid = (end-start)/2+start;
            if(nums[mid]==target){
                ans = mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstPos(nums,target),lastPos(nums,target)};
    }
}