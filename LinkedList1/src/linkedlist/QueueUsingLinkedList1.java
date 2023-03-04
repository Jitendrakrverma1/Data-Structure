package linkedlist;
import java.util.Scanner;
public class QueueUsingLinkedList1
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
	Node Front = null;
	Node Rear = null;
	
	public void enqueue(Scanner sc)
	{
		int data;
		System.out.println("Enter data:");
		data = sc.nextInt();
		Node new_node = new Node(data);
		if(Front==null)
		{
			Front = new_node;
			Rear = new_node;
		}
		else
		{
			Rear.next = new_node;
			Rear = new_node;
		}
	}
	
	public void dequeue()
	{
		if(Front==null)
		{
			System.out.println("Underflow...");
		}
		else
		{
			Front = Front.next;
		}
	}
	
	public void display()
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
	   Scanner sc = new Scanner(System.in);
	   QueueUsingLinkedList1 ob = new QueueUsingLinkedList1();
	   while(true)
	   {
		   System.out.println("=====choice====");
		   System.out.println("1.enqueue\n2.dequeue\n3.display\n4.exit");
		   int ch = sc.nextInt();
		   switch(ch)
		   {
		   case 1:
			   ob.enqueue(sc);
			   break;
		   case 2:
			   ob.dequeue();
			   break;
		   case 3:
			   ob.display();
                break;
		   case 4:
			   System.out.println("Queue operation ended.......");
			   System.exit(0);
		   
		   }
	   }
   }
}
