//https://leetcode.com/problems/middle-of-the-linked-list/submissions/
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null && head.next==null) return head;
        ListNode slow= head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
