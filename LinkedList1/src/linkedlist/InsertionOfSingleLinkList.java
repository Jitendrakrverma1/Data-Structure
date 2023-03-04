package linkedlist;

import java.util.Scanner;
public class InsertionOfSingleLinkList
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
		int data , n, m;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		do {
		System.out.println("Enter data:");
		data = s.nextInt();
		Node new_node = new Node(data);
		if(head==null) {
			head = new_node;
		}
		else 
		{
			System.out.println("1.Insert At beggining\n2.At End\n3.specific pos:");
			m = s.nextInt();
			switch(m)
			{
			case 1:
				new_node.next = head;
				head = new_node;
				break;
			case 2:
				Node temp = head;
				while(temp.next!=null)
				{
					temp = temp.next;
				}
				temp.next = new_node;
				break;
			case 3:
				System.out.println("Enter the position of node to be inserted:");
				int p = s.nextInt();
				Node temp1 = head;
				for(int i=0; i<p-1; i++)
				{
					temp1 = temp1.next;
				}
				new_node.next = temp1.next;
				temp1.next = new_node;
				break;
			 
			}
		}
		System.out.println("Do you want to add more data. If yes press:1");
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
	   InsertionOfSingleLinkList ob = new InsertionOfSingleLinkList();
	   ob.creation();
	   ob.traverse();
   }
}
