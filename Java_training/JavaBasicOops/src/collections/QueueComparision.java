package collections;
import java.util.*;
import basicjava.*;

public class QueueComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        // Step 1: Create a PriorityQueue and a LinkedList
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> linkedList = new LinkedList<>();

        // Step 2: Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);

        // Step 3: Add elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(15);

        // Step 4: Peek the head of each queue
        System.out.println("Head of PriorityQueue: " + priorityQueue.poll());
        System.out.println("Head of LinkedList: " + linkedList.poll());
        
        System.out.println("Head of PriorityQueue: " + priorityQueue.poll());
        System.out.println("Head of LinkedList: " + linkedList.poll());


        // Step 6: Print the queues after removal
        System.out.println("PriorityQueue after removal: " + priorityQueue);
        System.out.println("LinkedList after removal: " + linkedList);
        
       */
    	
    	//System.out.println("priority basis of empid of Comparable of Employee:");
    	//u r not passing comparator in PriorityQueue constructor then it will
    	//use element's comparable interface for comparison
    	//if comparable is not implemented and comparator is also not passed
    	//it will give exception
    	Queue<Employee> qemp = new PriorityQueue<Employee> ();
    	Queue<Employee> q = new LinkedList<Employee>();
    	Employee e1 = new Employee(4, 45000, "Tarun", 10);
		Employee e2 = new Employee(3, 55000, "Varun", 20);
		Employee e3 = new Employee(2, 45000, "barun", 10);
		Employee e4 = new Employee(1, 55000, "karun", 20);
 	    
 	    
 	    qemp.offer(e1);
 	    qemp.offer(e2);
 	    qemp.offer(e3);
 	    qemp.offer(e4);
 	    
 	    
 	    q.offer(e1);
	    q.offer(e2);
	    q.offer(e3);
	    q.offer(e4);
 	    
 	    
 	    while(!qemp.isEmpty())
 	    	{
 	    	System.out.println(qemp.poll());
 	    	}
        
 	    System.out.println("in linked list");
 	   while(!q.isEmpty()) {
	    	System.out.println("hello "+q.poll());
 	   }
       
        System.out.println("priority basis of empsalary");
        Comparator<Employee> cmp = (Employee a,Employee b)->(int)(a.getsalary() - b.getsalary());
       func(cmp);
//        
       System.out.println("priority basis of empname");
        cmp = (Employee a,Employee b)->a.getName().compareTo(b.getName());
        func(cmp);
         
 
        
        
    }

    
    
    static void func(Comparator<Employee> cmp)
    {
    	 
        Queue<Employee> qemp = new PriorityQueue<Employee> (cmp);
        Employee e1 = new Employee(4, 45000, "Tarun", 10);
		Employee e2 = new Employee(3, 55000, "Varun", 20);
		Employee e3 = new Employee(2, 45000, "barun", 10);
		Employee e4 = new Employee(1, 55000, "karun", 20);
	    
	    qemp.offer(e1);
	    qemp.offer(e2);
	    qemp.offer(e3);
	    qemp.offer(e4);
	  
	    
	    while(!qemp.isEmpty())
	    	System.out.println(qemp.poll());

	}

}
