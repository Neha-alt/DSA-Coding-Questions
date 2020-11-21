//https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem

static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode temp = head;
        if(position==0){
            head=head.next;
            return head;
        }
        for(int i=0;i<position-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
