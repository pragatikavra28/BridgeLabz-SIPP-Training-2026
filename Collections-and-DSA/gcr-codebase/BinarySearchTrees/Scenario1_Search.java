public class Scenario1_Search {
    public boolean search(TreeNode root,int target){
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val==target) return true;
            cur=target<cur.val?cur.left:cur.right;
        }
        return false;
    }
}
