package linkedlist;
import java.util.Scanner;

public class CircularLinkedList1 
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
	Node head = null;
	Node tail = null;
	public void creation()
	{
		int data, n;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		do
		{
		System.out.println("Enter data: ");
		data = s.nextInt();
		Node new_node = new Node(data);
		if(head==null)
		{
			head = new_node;
			tail = new_node;
			new_node.next = head;
		}
		else
		{
			new_node.next = head;
			head = new_node;
			tail.next = head;
		}
		System.out.println("Do you want to add more data: if yes press:1");
	    n = s.nextInt();
	  }while(n==1);
   }
	
	public void traverse()
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("LL does not exist....");
		}
		else
		{
			do
			 {
				System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			while(temp!=head);
		}
	}
  public static void main(String[] args)
  {
	  CircularLinkedList1 ob = new CircularLinkedList1();
	  ob.creation();
      ob.traverse();
  }
}
