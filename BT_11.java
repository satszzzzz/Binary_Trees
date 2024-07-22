import java.util.*;
public class BT_11
{
    void postOrder(TreeNode root)
    {
        // T(N) -> O(N) S(N) -> O(2*N)
        Deque<TreeNode> s1=new ArrayDeque<>();
        Deque<TreeNode> s2=new ArrayDeque<>();

        List<Integer> l=new ArrayList<>();

        s1.push(root);
        while(!s1.isEmpty())
        {
            root=s1.pop();
            s2.push(root);
            if(s2.peekFirst().left!=null) s1.push(s2.peekFirst().left);
            if(s2.peekFirst().right!=null) s2.push(s2.peekFirst().right);
        }

        while(!s2.isEmpty())
            l.add(s2.pop().data);
        
        System.out.println(l);
    }
   public static void main(String args[])
    {
        BT_11 x=new BT_11();
        TreeNode t=new TreeNode(1);
        t.left=new TreeNode(2);
        t.right=new TreeNode(3);
        t.left.left=new TreeNode(4);
        t.left.right=new TreeNode(5);
        x.postOrder(t);
    }
}