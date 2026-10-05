class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int right = 0;
        int currSum = 0 ;
        int numberOfSubArrays = 0;
        while(right<nums.length){
            currSum += nums[right];
            if(map.containsKey(currSum-k)){
                numberOfSubArrays += map.get(currSum-k);
                // System.out.println("Found At "+right);    
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
            right++;
        }
        return numberOfSubArrays;

        
    }
}