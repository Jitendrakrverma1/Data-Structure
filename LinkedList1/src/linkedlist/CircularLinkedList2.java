package linkedlist;
import java.util.Scanner;
public class CircularLinkedList2 
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
		System.out.println("Enter data:");
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
			System.out.println("=========Enter your choice==============");
			System.out.println("1.insertAt Beginnig\n2.At end\n3.At given position:");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				new_node.next = head;
				head = new_node;
				tail.next = head;
				break;
			case 2:
				tail.next = new_node;
				tail = new_node;
				new_node.next = head;
				break;
			case 3:
				System.out.println("Enter position of node to be inserted:");
				int d = s.nextInt();
				Node temp = head;
				for(int i=1; i<d-1; i++)
				{
					temp = temp.next;
				}
				new_node.next = temp.next;
				temp.next = new_node;
				break;
			}
		}
		System.out.println("Do you want to add more data if yes press:1");
		n = s.nextInt();
	  }while(n==1);
	}
	
	public void traverse()
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("LL does not exist.....");
		}
		else
		{
			do
			{
				System.out.print(temp.data+"  ");
				temp = temp.next;
			}
			while(temp!=head);
		}
	}
   public static void main(String[] args)
   {
	   CircularLinkedList2 ob = new CircularLinkedList2();
	   ob.creation();
	   ob.traverse();
   }
}
