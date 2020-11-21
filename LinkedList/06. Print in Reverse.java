//https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem 
 
 static void reversePrint(SinglyLinkedListNode head) {
      if(head==null) return ;
      Stack<SinglyLinkedListNode> st = new Stack<>();
      SinglyLinkedListNode temp = head;
      while(temp!=null){
          st.add(temp);
          temp = temp.next;
      }
      while(!st.isEmpty()){
          SinglyLinkedListNode node = st.pop();
          System.out.println(node.data);
      }
        

    }
