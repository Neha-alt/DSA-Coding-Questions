//https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1#
class GfG
{
    Node removeDuplicates(Node root)
    {
	    Node temp = root;
	    while(temp.next!=null){
	        if(temp.data==temp.next.data){
	            temp.next=temp.next.next;
	        }else
	        temp=temp.next;
	    }
	    return root;
    }
}
