 //https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
 
 static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next = null;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
         SinglyLinkedListNode newTemp = prev;
        for(int i=1;i<=positionFromTail;i++){
            newTemp = newTemp.next;
        }
        return newTemp.data;
    }
