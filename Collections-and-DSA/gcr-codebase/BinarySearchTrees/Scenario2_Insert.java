public class Scenario2_Insert {
    public TreeNode insert(TreeNode node,int id){
        if(node==null) return new TreeNode(id);
        if(id<node.val) node.left=insert(node.left,id);
        else if(id>node.val) node.right=insert(node.right,id);
        return node;
    }
}
