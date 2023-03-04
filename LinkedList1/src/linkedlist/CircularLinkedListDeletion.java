package linkedlist;
import java.util.Scanner;
public class CircularLinkedListDeletion 
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
		int data , n;
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
		System.out.println("Do you want to add more data. If yes Press:1");
		n = s.nextInt();
		}while(n==1);
	}
	
	// It is used to traverse insert element.
	public void traverse()
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("LL does not exist......");
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
		System.out.println();
	}
	
	
	public void delete()
	{
		int  d, p;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do
		{
			if(head==null)
			{
				System.out.println("LL does not exits....");
			}
		 else
			{
		     System.out.println("=========Enter your choice===========");
		     System.out.println("1.DeleteAt beginning\n2.At end\n3.At given position:");
		     int choice1 = sc.nextInt();
		switch(choice1)
		{
		case 1:
			 Node temp = head;
			 temp = temp.next;
			 head = temp;
			 tail.next = head;
			break;
		case 2:
			Node temp1 = head;
			Node ptr = temp1.next;
			while(ptr.next!=head)
			{
				temp1 = ptr;
				ptr = ptr.next;
			}
			temp1.next = head;
			tail = temp1;
			break;
		case 3:
			System.out.println("Enter the position of element to be deleted:");
			p = sc.nextInt();
			Node temp2 = head;
			Node ptr1 = temp2.next;
			for(int i=1; i<p-1; i++)
			{
				temp2 = ptr1;
				ptr1 = ptr1.next;
			}
			temp2.next = ptr1.next;
			break;
		}
	 }
		System.out.println("Do you want to delete more data.If yes press:1");
		d = sc.nextInt();
	  }
	 while(d==1);
	}
	
	// It is used to traverse delete element
	public void traverse1()
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("LL does not exist......");
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
	   CircularLinkedListDeletion ob = new CircularLinkedListDeletion();
	   ob.creation();
	   ob.traverse();
	   ob.delete();
	   ob.traverse1();
   }
}
