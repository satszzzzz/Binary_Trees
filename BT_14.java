import java.util.*;
public class BT_14
{

    static int maxDepth(TreeNode root)
    {
        if(root==null)
            return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);

        return 1+Math.max(lh, rh);
    }
   public static void main(String args[])
    {
        
    }
}