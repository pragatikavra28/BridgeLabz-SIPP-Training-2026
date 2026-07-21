public class Scenario3_Delete {
    public TreeNode delete(TreeNode node,int key){
        if(node==null) return null;
        if(key<node.val) node.left=delete(node.left,key);
        else if(key>node.val) node.right=delete(node.right,key);
        else{
            if(node.left==null&&node.right==null) return null;
            if(node.left==null) return node.right;
            if(node.right==null) return node.left;
            TreeNode s=node.right;
            while(s.left!=null) s=s.left;
            node.val=s.val;
            node.right=delete(node.right,s.val);
        }
        return node;
    }
}
