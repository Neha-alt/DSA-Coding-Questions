//https://practice.geeksforgeeks.org/problems/preorder-traversal/1
class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> al;
    static ArrayList<Integer> preorder(Node root)
    {
        al = new ArrayList<>();
        fun(root);
        return al;
    }
    public static void fun(Node root){
        if(root==null)
        return;
        al.add(root.data);
        fun(root.left);
        fun(root.right);
    }

}
