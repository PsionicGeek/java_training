package DataStructure1;

public class QueueLinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);
		q.offer(70);
		q.display();
		//int n= q.poll(10);
		System.out.println("deleted element-> "+q.poll()); 
		System.out.println("deleted element-> "+q.poll());
		q.display();
		
		

	}
}
	
	class Queue{
		
		class Node{
			int data;
			Node next = null;
			
			Node(int data){
				this.data = data;
				this.next = null;
			}
		}
		
		
		
		Node head = null;
		
		void offer(int data) {
			Node newnode = new Node(data);
			Node curr = head;
			if(head==null) {
				head = newnode;
			}else {
				
				while(curr.next!=null) {
					curr= curr.next;
					
				}
				curr.next = newnode;
			}
			
			
		}
		
		int poll() {
			Node curr = head;
			Node prev = head;
			while(curr.next!=null) {
				prev = curr;
				curr= curr.next;
			}
			int n = curr.data;
			
			prev.next= null;
			
			
			return n;
		}
		
		void display() {
			
			Node curr = head;
			while(curr!=null) {
				System.out.print(curr.data+"->");
				curr = curr.next;
			}
			
		}
	}


