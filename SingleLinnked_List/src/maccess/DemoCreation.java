package maccess;
import java.util.Scanner;
public class DemoCreation 
{
   //create inner class for creating node
	static class Node
	{
		int data;
		Node next = null;
	  // create constructor for node
	  Node(int data)
	  {
		  this.data = data;
		  this.next = null;
	  }
	}
	Node head = null;
	public void creation()
	{
		int data,n;
		Scanner s = new Scanner(System.in);
		do
		{
		System.out.println("Enter data:");
		data = s.nextInt();
		Node new_node = new Node(data);
		if(head == null)
		{
			head = new_node;
		}
		else
		{
			System.out.println("1.Insert beginning\n2.at end\n3.specific pos:");
			int m = s.nextInt();
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
				System.out.println("Enter the position of elemrnt that you want to insert:");
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
		System.out.println("Do you want to insert more data. If yes then Press:1");
		n = s.nextInt();
		}
		while(n==1);	
	}
	
	public void traversal()
	{
		Node temp =head;
		if(head==null)
		{
			System.out.println("ll does not exist....");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.next +" ");
				temp = temp.next;
			}
		}
	}
   public static void main(String[] args)
   {
	  DemoCreation sr = new DemoCreation();
	  sr.creation();
	  sr.traversal();
   }
}
