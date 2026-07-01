class Solution {

    public void backTrack(int[] candidates,int target,List<List<Integer>> list,List<Integer> curr,int i){
        if(target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        
        if(i>=candidates.length||target<0){
            return;
        }

        if(candidates[i]<=target){
            curr.add(candidates[i]);
            backTrack(candidates,target-candidates[i],list,curr,i);
            curr.remove(curr.size()-1);
        }               
        backTrack(candidates,target,list,curr,i+1);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(candidates,target,list,new ArrayList<>(),0);
        return list;
    }
}