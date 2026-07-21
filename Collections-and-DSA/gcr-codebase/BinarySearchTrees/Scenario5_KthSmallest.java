import java.util.*;
public class Scenario5_KthSmallest {
    public int kthSmallest(TreeNode root,int k){
        Deque<TreeNode> st=new ArrayDeque<>();
        TreeNode cur=root;
        int c=0;
        while(cur!=null||!st.isEmpty()){
            while(cur!=null){st.push(cur);cur=cur.left;}
            cur=st.pop();
            if(++c==k) return cur.val;
            cur=cur.right;
        }
        throw new IllegalArgumentException();
    }
}
