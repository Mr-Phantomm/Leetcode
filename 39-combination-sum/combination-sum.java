class Solution {

    public void backTrack(int i,int[] candidates,int target,List<Integer> list , Set<List<Integer>> ans){
        if(i == candidates.length||target<0)return;
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j=i;j<candidates.length;j++){
            list.add(candidates[j]);
            backTrack(j,candidates,target-candidates[j],list,ans);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        backTrack(0,candidates,target,new ArrayList<>(),ans);
        return new ArrayList<>(ans);
    }
}