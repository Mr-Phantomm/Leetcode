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

    public int goodNode(TreeNode root,int MAX){
        if(root==null)return 0;
        int left = goodNode(root.left,Math.max(MAX,root.val));
        int right = goodNode(root.right,Math.max(MAX,root.val));
        int currentNode = root.val>=MAX?1:0;
        return left+right+currentNode;
    }

    public int goodNodes(TreeNode root) {   
        return goodNode(root,Integer.MIN_VALUE);
        
    }
}