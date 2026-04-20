class Solution {
    public void all(int[] nums,int i,List<Integer> list ,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        all(nums,i+1,list,ans);
        list.add(nums[i]);
        all(nums,i+1,list,ans);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> bitManipulation(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        int number = (int)Math.pow(2,nums.length)-1;
        for(int i=0;i<=number;i++){
            List<Integer> list = new ArrayList<>();
            int curr =i ;
            int j=0;
            while(curr>0){
                if((curr&1)==1){
                    list.add(nums[j]);
                }
                curr>>=1;
                j++;
            }
            ans.add(list);
        }
        return ans;
    }
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<>();
        // all(nums,0,new ArrayList<>(),ans);
        // return ans;
        return bitManipulation(nums);
    }
}