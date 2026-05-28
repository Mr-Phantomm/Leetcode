class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> list = new HashSet<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(freq.get(num)>nums.length/3)list.add(num);
        }
        return new ArrayList<>(list);
    }
}