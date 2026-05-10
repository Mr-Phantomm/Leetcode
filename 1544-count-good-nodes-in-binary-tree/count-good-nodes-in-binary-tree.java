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
    public int goodNodes(TreeNode root,int greatest){
        if(root==null)return 0;
        if(root.val>=greatest)System.out.println(root.val);
        return goodNodes(root.left,Math.max(greatest,root.val))+goodNodes(root.right,Math.max(greatest,root.val))+(root.val>=greatest?1:0);
    }
    public int goodNodes(TreeNode root) {
        return goodNodes(root,Integer.MIN_VALUE);
    }
}