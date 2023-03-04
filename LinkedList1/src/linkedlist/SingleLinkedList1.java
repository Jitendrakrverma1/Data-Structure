package linkedlist;
import java.util.Scanner;
public class SingleLinkedList1 
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
	public void creation()
	{
		int data , n;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter data:");  //  20 l10
			data = s.nextInt();
			Node new_node = new Node(data);
			if(head==null)
			{
				head = new_node;
			}
			else
			{
				new_node.next = head;
				head = new_node;
			}
			System.out.println("Do you want to add more data. if yes press:1");
			n = s.nextInt();
		}while(n==1);
	}
	public void traverse()
	{
       Node temp = head;
		if(head == null)
		{
			System.out.println("LL does not exist......");
		}
		else
		{
			while(temp!=null)
			{
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
	  }
    }
  public static void main(String[] args)
  {
	  SingleLinkedList1 ob = new SingleLinkedList1();
	  ob.creation();
	  ob.traverse();
  }
}
