package linkedlist;
import java.util.Scanner;
public class doublyLinkedListDeletion1
{ 
	static class Node
	{
		int data;
		Node next,prev;
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
	
   // It is for insertion
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
		System.out.println();
	}
   
   public void deletion()
   {
	   int n;
	 @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	 do
	 {
	 System.out.println("=========Enter your choice=========");
	 System.out.println("1.delete At beginnig\n2.at end\n3.at given loc delet");
	 int choice1 = s.nextInt();
	 switch(choice1)
	 {
	 case 1:
		   Node temp = head;
		   
		   temp = temp.next;
		   head = temp;
		   head.prev = null;
		   break;
	 case 2:
		    Node temp1 = tail;
		    temp1 = temp1.prev;
		    temp1.next = null;
		    tail = temp1;
		    break;
	 case 3:
		 Node temp2 =head;
		 Node ptr = temp2.next;
		 System.out.println("Enter the position to be deleted:");
		 int p = s.nextInt();
		 for(int i=1; i<p-2; i++)
		 {
			temp2 = ptr;
			ptr = ptr.next;
		 }
		 temp2.next = ptr.next;
		 ptr.next.prev = temp2;
		 break;
	 }
	 System.out.println("Do you want to delete more element: if yes press:1");
	 n = s.nextInt();
   }
 while(n==1);
  }
   
   // it is for deletion 
	public void traverse1()
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
		doublyLinkedListDeletion1 ob = new doublyLinkedListDeletion1();
		ob.creation();
		ob.traverse();
		ob.deletion();
		ob.traverse1();
	}
}
