class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            System.out.println(start+" "+end);
            int mid = (end-start)/2+start;
            if(nums[mid]==target)return mid;
            if(nums[mid]<nums[start]){
                if(nums[mid]<target&&nums[end]>=target){
                    start=mid+1;
                }else{
                    end = mid-1;
                }
            }
            else{
                if(nums[start]<=target&&nums[mid]>target)end=mid-1;
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}