//https://leetcode.com/problems/sort-list/submissions/
class Solution {
    public ListNode merge(ListNode l1,ListNode l2){
      
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode temp = new ListNode(-1);
        ListNode ptr3 = temp;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val <=ptr2.val){
                ptr3.next=ptr1;
                ptr1=ptr1.next;
            }else{
                ptr3.next=ptr2;
                ptr2=ptr2.next;
            }
            ptr3=ptr3.next;
        }
        if(ptr1!=null){
            ptr3.next=ptr1;
        }
         if(ptr2!=null){
            ptr3.next=ptr2;
        }
        return temp.next;
    }
  
    public ListNode sortList(ListNode head) {
      
        if(head==null || head.next==null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast= slow.next;
        slow.next=null;
        return merge(sortList(head),sortList(fast));
    }
}
