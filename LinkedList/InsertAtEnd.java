package singlyLinkedList;


public class InsertAtEnd {

	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtEnd obj = new InsertAtEnd();
		obj.addNode(10);
		obj.addNode(20);
		obj.addNode(30);
		obj.addNode(40);
		obj.addNode(50);
		obj.print();
		
	}
	public void addNode(int data) {
		Node newNode = new Node(data);
		Node temp=head;
		if(head==null) {
			head=newNode;
			return;
		}
		
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		
	}
	public void print() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			
		}
	}

}
