//https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem

static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
       SinglyLinkedListNode temp = head;
       while(temp.next!=null){
           if(temp.data == temp.next.data){
               temp.next = temp.next.next;
           }
           else{
               temp = temp.next;
           }
       }
       return head;
    }
