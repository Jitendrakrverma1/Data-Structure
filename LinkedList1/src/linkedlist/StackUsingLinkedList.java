package linkedlist;
import java.util.Scanner;
public class StackUsingLinkedList 
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
	Node top = null;
	
	void push(Scanner sc)
	{
		System.out.println("Enter data:");
		int data = sc.nextInt();
		Node new_node = new Node(data);
		if(top==null)
		{
		   top = new_node;
		}
		else
		{
			new_node.next = top;
			top = new_node;
			System.out.println("Items are inserted.......");
		}
	}
	
	void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is empty........");
		}
		else
		{
			top = top.next;
			System.out.println("Items are deleted........");
		}
	}
	
	void display()
	{
		Node temp = top;
		System.out.println("Items are:-");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	  StackUsingLinkedList ob = new StackUsingLinkedList();
	  while(true)
	  {
		  System.out.println("====Enter your choice====");
		  System.out.println("1.push\n2.pop\n3.display\n4.exit");
		  int ch = sc.nextInt();
		  switch(ch)
		  {
		  case 1:
			  ob.push(sc);
			  break;
		  case 2:
			  ob.pop();
			  break;
		  case 3:
			  ob.display();
			  break;
		  case 4:
			  System.out.println("stack operation eded....");
			  System.exit(0);
		  }
	  }
  }
}
