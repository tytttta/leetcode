/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        if(root.left==null || root.right==null)
            return false;
        
        dfs(root.left,l1);
        releaseDfs(root.right,l2);
        if(l1.size()!=l2.size())
            return false;
        else{
            for(int i=0;i<l1.size();i++){
                if(l1.get(i)!=l2.get(l2.size()-1-i))
                    return false;
            }
        }
        return true;
    }
    public void dfs(TreeNode root, List l){
        if(root==null)
            l.add(-1);
        else {
            dfs(root.left,l);
            dfs(root.right,l);
            l.add(root.val);
        }
    }
    public void releaseDfs(TreeNode root, List l){
         if(root==null ){
            l.add(-1);
        }
        else {
            l.add(root.val);
            releaseDfs(root.left,l);
            releaseDfs(root.right,l);
            
        }
    }
}