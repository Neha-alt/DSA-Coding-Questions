 //https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
 
 static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head==null){
            head = newNode;
            return head;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;

    }
