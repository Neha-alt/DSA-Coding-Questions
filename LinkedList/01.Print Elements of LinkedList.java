//https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
