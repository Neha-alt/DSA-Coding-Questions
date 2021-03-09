//https://practice.geeksforgeeks.org/problems/inorder-traversal/1
class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> al;
    ArrayList<Integer> inOrder(Node root)
    {
        al= new ArrayList<>();
        fun(root);
        return al;
    }
    public void fun(Node root){
        if(root==null)
        return;
        fun(root.left);
        al.add(root.data);
        fun(root.right);
        
    }
    
}
