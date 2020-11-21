//https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode prev= null;
        SinglyLinkedListNode next = null;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;

    }
