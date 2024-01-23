package DataStructure1;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
			LinkLst ls = new LinkLst();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			ls.display();
			
			ls.delete(10);
			ls.delete(20);
			ls.display();

		}

	}


	class LinkLst
	{
		
		class Node
		{
			int data;
			    
			Node next;
			
			
			Node(int data)
			{
				this.data = data;
				this.next = null;
			}
		}
		
		
		 Node head = null;
		
		
		 void add(int data)
		 {
			 //data = 40;
			 //head = 10,null
			 //newnode = 40,null
			 
			 Node newnode = new Node(data);
			 Node current = null;
					 
			 if(head==null)
			 {
				 head = newnode;
			 }
			 else
			 {
				 current = head; //current = 10
				 while(current.next!=null)
				 {
					 current = current.next;  //current = 30
				 }
				 
				 current.next = newnode; //current=40
			 }
			 
		 }
		 
		 void delete(int data)
		 {
			Node curr = head;
			if(curr.next==null) {
				if(curr.data == data) {
					curr = null;
					head =null;
				}
			}
			else {
			while(curr.next!=null) {
				if(curr.data== data) {
					Node temp = curr.next.next;
					curr.next= temp;
					break;
				}
				curr = curr.next;
			}
			} 
		 }
		 
		 void display()
		 {
			 Node current = null;
			 
			 current = head;
			 
			 while(current!=null)
			 {
				 System.out.print(current.data+" --> ");
				 current = current.next;
			 }
			 
			 System.out.println("Null");
			 
		 }

}
