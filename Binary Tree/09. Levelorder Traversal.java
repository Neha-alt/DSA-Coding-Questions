//https://practice.geeksforgeeks.org/problems/level-order-traversal/1
class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
       ArrayDeque<Node> q = new ArrayDeque<>();
       ArrayList<Integer> al = new ArrayList<>();
       q.add(node);
       while(q.size()>0){
           
           Node n = q.remove();
           al.add(n.data);
           if(n.left!=null)
           q.add(n.left);
           if(n.right!=null)
           q.add(n.right);
       }
       return al;
    }
}
//add root to queue and add children to queue if they exist.
//remove root,add to arraylist an dthen add children
