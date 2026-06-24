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
    Map<Integer,Integer> map=new HashMap<>();
    int postOrder;

    public TreeNode build(int s,int e,int[] inorder,int[] postorder){
        if(s>e)return null;
        int index=map.get(postorder[postOrder--]);
        TreeNode root=new TreeNode(inorder[index]);
        root.right=build(index+1,e,inorder,postorder);
        root.left=build(s,index-1,inorder,postorder);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postOrder=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(0,inorder.length-1,inorder,postorder);

    }
}