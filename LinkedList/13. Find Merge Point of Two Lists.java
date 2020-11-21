//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;
        while(temp1!=temp2){
            temp1 = temp1==null?head2:temp1.next;
            temp2 = temp2==null?head1:temp2.next;
        }
        return temp1.data;
    }
