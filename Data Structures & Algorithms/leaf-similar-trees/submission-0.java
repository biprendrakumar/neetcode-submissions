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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        solve(root1,a);
        solve(root2,b);
        return a.equals(b);
    }
    public void solve(TreeNode root,List<Integer> l){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            l.add(root.val);
            return;
        }
        solve(root.left,l);
        solve(root.right,l);
    }
}
