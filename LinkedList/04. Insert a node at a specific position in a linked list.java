//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode temp = head;
         SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
         for(int i=0;i<position-1;i++){
             temp = temp.next;
         }
         newNode.next = temp.next;
         temp.next = newNode;
         return head;
    }
