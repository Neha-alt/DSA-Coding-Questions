//https://www.hackerrank.com/challenges/compare-two-linked-lists/problem

 static boolean compareLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
       if(headA==null && headB==null) return true;
       
       while(headA!=null && headB!=null){
           if(headA.data!=headB.data)
           break;
           if(headA.next==null && headB.next==null)
           return true;
           headA = headA.next;
           headB = headB.next;
       }
       return false;
    }
