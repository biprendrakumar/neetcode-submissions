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
    public TreeNode reverseOddLevels(TreeNode root) {
        
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return null;
        }
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<TreeNode> ans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                ans.add(temp);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            if(level%2==1){
                int left=0;
                int right=ans.size()-1;
                while(left<right){
                    int t=ans.get(left).val;
                    ans.get(left).val=ans.get(right).val;
                    ans.get(right).val=t;
                    left++;
                    right--;
                }
            }
            level++;
        }
        return root;
    }
}
