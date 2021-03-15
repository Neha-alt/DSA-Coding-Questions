//https://leetcode.com/problems/add-two-numbers/submissions/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        while(l1!=null || l2!=null ||c!=0){
            if(l1!=null){
                c+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                c+=l2.val;
                l2=l2.next;
            }
            res.next= new ListNode(c%10);
            c/=10;
            res=res.next;
            
        }
        return temp.next;
    }
}
