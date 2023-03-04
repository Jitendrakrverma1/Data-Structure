package linkedlist;
import java.util.Scanner;
public class QueueUsingLinkedList2 
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node Front =null;
	Node Rear = null;
	
	void enqueue(Scanner sc)
	{
		int data;
		System.out.println("Enter data:");
		data = sc.nextInt();
		Node new_node = new Node(data);
		if(Front==null)
		{
			Front=Rear=new_node;
		}
		else
		{
			Rear.next = new_node;
			Rear = new_node;
		}
	}
	
	void dequeue()
	{
		if(Front==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			Front = Front.next;
		}
	}
	
	void display()
	{
		Node temp = Front;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
	}
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
//	  int n;
	  QueueUsingLinkedList2 ob = new QueueUsingLinkedList2();
	  while(true) {
		  
		  System.out.println("======choice=====");
		  System.out.println("1.enqueue\n2.dequeue\n3.display");
		  int ch = s.nextInt();
		  switch(ch)
		  {
		  case 1:
			  ob.enqueue(s);
			  break;
		  case 2:
			  ob.dequeue();
			  break;
		  case 3:
			  ob.display();
			  break;
		  }
	  }
  }
}
