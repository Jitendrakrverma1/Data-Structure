package linkedlist;
import java.util.Scanner;
public class SingleLinkDeletion 
{
	// Creation of node in linkedList
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
	
	// creation of linkedList 
	public void creation()
	{
		int data, n, m , p;
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
		}
		else
		{
			// Insertion of a node in linkedList
			System.out.println("=======Enter your choice====");
			System.out.println("1.insert from beggin\n2.insert At end\n3.insert at specific pos.");
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
				System.out.println("Enter position of node to be inserted:");
				p = s.nextInt();
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
		System.out.println("Do you want to add more data if yes press:1");
		n = s.nextInt();
	}while(n==1);
}
	
	public void delete()
	{
		int n,m,p;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do
		{
			if(head==null)
			{
				System.out.println("LL does not exist.....");
			}
			else
			{
				// deletion of node in single linkedList
				System.out.println("1.delete from beggin\n2.Delete At end\n3.at specific pos.");
				m = sc.nextInt();
				switch(m)
				{
				case 1:
					Node temp = head;
					temp = temp.next;
					head = temp;
					break;
				case 2:
					Node temp1 = head;
					Node ptr = temp1.next;
					while(ptr.next!=null)
					{
						temp1 = ptr;
						ptr= ptr.next;
					}
					temp1.next = null;
					break;
				case 3:
					System.out.println("enter position of node to be deleted;");
					p = sc.nextInt();
					Node temp2 = head;
					Node ptr1 = temp2.next;
					for(int i=0; i<p-2; i++)
					{
						temp2 = ptr1;
						ptr1 = ptr1.next;
					}
					temp2.next = ptr1.next;
					break;
				}
			}
			System.out.println("Do you want to delete more data.If yes , press1");
			n = sc.nextInt();
		}
		while(n==1);
	}
	
	// Printing the element of linkedList
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
	  SingleLinkDeletion ob = new SingleLinkDeletion();
	  ob.creation();
	  ob.delete();
	  ob.traverse();
  }
}
