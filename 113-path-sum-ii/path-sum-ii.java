/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void backTrack(int targetSum,TreeNode root,List<Integer> currPath,List<List<Integer>> allPaths){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null&&targetSum==root.val){
            currPath.add(root.val);
            allPaths.add(new ArrayList<>(currPath));
            currPath.remove(currPath.size()-1);
            return;
        }
        currPath.add(root.val);
        backTrack(targetSum-root.val,root.left,currPath,allPaths);
        backTrack(targetSum-root.val,root.right,currPath,allPaths);
        currPath.remove(currPath.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(targetSum,root,new ArrayList<>(),ans);
        return ans;
    }
}