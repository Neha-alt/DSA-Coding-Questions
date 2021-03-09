//https://practice.geeksforgeeks.org/problems/postorder-traversal/1
class Tree
{
    ArrayList<Integer> al;
    ArrayList<Integer> postOrder(Node root)
    {
       al = new ArrayList<>();
       fun(root);
       return al;
    }
    public void fun(Node node){
        if(node==null)
        return;
        fun(node.left);
        fun(node.right);
        al.add(node.data);
    }
}
