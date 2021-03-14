//https://leetcode.com/problems/reverse-linked-list/submissions/

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode frwd = null;
        while(curr!=null){
            frwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frwd;
        }
        return prev;
    }
}
