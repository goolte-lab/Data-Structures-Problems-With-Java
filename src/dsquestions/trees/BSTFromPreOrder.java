package dsquestions.trees;

public class BSTFromPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            insertBst(root,preorder[i]);
        }
        return root;
    }

    private static TreeNode insertBst(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        else if(root.val>val){
            root.left=insertBst(root.left,val);
        }
        else{
            root.right=insertBst(root.right,val);
        }
        return root;
    }
}
