package linkedlist;
import java.util.Scanner;
public class DoublyLinkedListCreation1 
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
		int data,n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Enter data:");
		data = sc.nextInt();
		Node new_node = new Node(data);
		if(head==null)
		{
		  head = new_node;	
		  tail = new_node;
		}
		else
		{
			new_node.next = head;
			head.prev = new_node;
			head = new_node;
		}
		System.out.println("do you add more data.If yes press:1");
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
	  DoublyLinkedListCreation1 ob = new DoublyLinkedListCreation1 ();
	  ob.creation();
	  ob.traverse();
  }
}
