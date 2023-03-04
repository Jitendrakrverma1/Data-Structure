package linkedlist;
import java.util.Scanner;

public class DoublyLinkedListInsertion1 
{
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	Node head = null;
	Node tail = null;
	public void creation()
	{
		int data,n,p;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.print("Enter data:");
		data = sc.nextInt();
		Node new_node = new Node(data);
		if(head==null)
		{
		  head = new_node;	
		  tail = new_node;
		}
		else
		{
			System.out.println("=========Enter your choice========");
			System.out.println("1.At Beginning.\n2.At End.\n3.At given position.");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			       new_node.next = head;
		           head.prev = new_node;
			       head = new_node;
			       break;
			case 2:
				   tail.next = new_node;
				   new_node.prev = tail;
				   tail = new_node;
				   break;
			case 3:
				Node temp = head;
				Node ptr = temp.next;
				System.out.println("Enter position to be inserted a node:");
				p = sc.nextInt();
				for(int i=1; i<p-1; i++)
				{
					temp = ptr;
					ptr = ptr.next;
				}
				temp.next = new_node;
				new_node.next = ptr;
				new_node.prev = temp;
				ptr.prev = new_node;
				break;
			}
		}
		System.out.print("do you add more data.If yes press:1");
		n = sc.nextInt();
	    }
		while(n==1);
	}	
	
	public void traverse()
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("LL does not exist...");
		}
		else
		{
		  do
		  {
		  System.out.print(temp.data+"-->");	
		  temp = temp.next;
		}
	   while(temp!=null);
		}
	}
  public static void main(String[] args)
  {
	  DoublyLinkedListInsertion1 ob = new DoublyLinkedListInsertion1();
	  ob.creation();
	  ob.traverse();
  }
}
