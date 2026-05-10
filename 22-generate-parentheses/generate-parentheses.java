class Solution {

    public void backtracking(String curr,int ToBeOpen,int ToBeClose,List<String> ans){
        if(ToBeOpen==0&&ToBeClose==0){
            ans.add(curr);
            return;
        }
        if(ToBeOpen>0){
            backtracking(curr+"(",ToBeOpen-1,ToBeClose+1,ans);
        }
        if(ToBeClose>0){
            backtracking(curr+")",ToBeOpen,ToBeClose-1,ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtracking("",n,0,list);
        return list;
    }
}