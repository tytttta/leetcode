public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return new ArrayList<String>();
        }
        List<String> al=new ArrayList();
        String path="";
        deepSearch(root, path, al);
        return al;
    }
        
    public void deepSearch(TreeNode tree, String path, List al){
        if(tree.left==null && tree.right==null){
            al.add(path+tree.val);
        }
        if(tree.left!=null){
            deepSearch(tree.left, path+tree.val+"->", al);
        }
        if(tree.right!=null){
            deepSearch(tree.right, path+tree.val+"->", al);
        }
    }
}