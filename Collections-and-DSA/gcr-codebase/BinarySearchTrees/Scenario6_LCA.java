public class Scenario6_LCA {
    public TreeNode lowestCommonAncestor(TreeNode root,int p,int q){
        TreeNode cur=root;
        while(cur!=null){
            if(p<cur.val&&q<cur.val) cur=cur.left;
            else if(p>cur.val&&q>cur.val) cur=cur.right;
            else return cur;
        }
        return null;
    }
}
