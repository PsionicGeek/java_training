package DataStructure1;

public class StackLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.display();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.display();
		

	}

}
class Stack{
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			next =null;
		}
	}
	
	Node head = null;
	
	void push(int data) {
		Node newnode = new Node( data);
		if(head== null) {
			head = newnode;
		}else {
			newnode.next= head;
			head = newnode;
		}
	}
	
	int pop() {
		
	    int n = head.data;
	    head = head.next;
	    return n;
	}
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
}
