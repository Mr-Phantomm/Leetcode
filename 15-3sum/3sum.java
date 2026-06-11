class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;

                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return new ArrayList<>(list);
    }
}