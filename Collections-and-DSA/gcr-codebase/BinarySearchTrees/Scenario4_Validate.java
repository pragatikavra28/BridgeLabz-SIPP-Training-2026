public class Scenario4_Validate {
    public boolean isValidBST(TreeNode root){
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean check(TreeNode n,long min,long max){
        if(n==null) return true;
        if(n.val<=min||n.val>=max) return false;
        return check(n.left,min,n.val)&&check(n.right,n.val,max);
    }
}
