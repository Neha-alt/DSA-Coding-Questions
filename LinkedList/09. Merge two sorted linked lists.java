 //https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
 
 static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode ll = new SinglyLinkedListNode(0);
        SinglyLinkedListNode temp = ll;
        //4 5 6, 1 2 10
        while(head1!=null && head2!=null){
           if(head1.data<head2.data){
           temp.next=head1;
           head1 = head1.next;
           }
           else{
           temp.next=head2; 
           head2 = head2.next;
           }
           temp = temp.next;
        }
        if(head1!=null){
            temp.next = head1;
            head1 = head1.next;
        }
         if(head2!=null){
            temp.next = head2;
            head2 = head2.next;
        }
        return ll.next;
    }
