//https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
       ArrayDeque<Node> q = new ArrayDeque<>();
       ArrayList<Integer> al = new ArrayList<>();
       Stack<Integer> st = new Stack<>();
       q.add(node);
       while(q.size()>0){
          
           Node n = q.remove();
           
           st.push(n.data);
           //10->30->20->60->40
           if(n.right!=null)
           q.add(n.right);
           if(n.left!=null)
           q.add(n.left);
       }
       while(st.size()>0){
           int x = st.pop();
           al.add(x);
       }
       return al;
    }
}      
