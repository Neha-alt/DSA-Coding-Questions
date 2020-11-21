//https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem

static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode toAdd = new SinglyLinkedListNode(data);
            SinglyLinkedListNode temp=llist;
            toAdd.next=llist;
            llist=toAdd;
            return llist; 

    }
