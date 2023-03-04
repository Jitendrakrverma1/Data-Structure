package maccess;
import java.util.Scanner;
public class DemoCreation 
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
		Scanner s = new Scanner(System.in);
		do {
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
		System.out.println("Do you want to add more data!if yes press:1");
		n = s.nextInt();
	    }
	while(n==1);
	}
	public void traverse()
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("LL does not exits...");
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
	  DemoCreation t = new DemoCreation();
	  t.creation();
      t.traverse();
  }
}
