class TreeNode 
{
    public int val;
    TreeNode left, right;

    TreeNode(int x) 
    {
        val = x;
    }
}

public class CheckBST 
{

    public boolean isValidBST(TreeNode root) 
    {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(TreeNode node, int min, int max) 
    {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;

        return isBST(node.left, min, node.val) &&
               isBST(node.right, node.val, max);
    }

    public static void main(String[] args) 
   {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        CheckBST obj = new CheckBST();
        System.out.println(obj.isValidBST(root)); 
   }
}