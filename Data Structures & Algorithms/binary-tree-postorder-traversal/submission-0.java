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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        sol(root,res);
        return res;
    }
    public void sol(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        sol(root.left,list);
        sol(root.right,list);
        list.add(root.val);
    }
}