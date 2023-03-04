package linkedlist;
import java.util.Scanner;

class queue
{
	int Front = -1, Rear = -1;
	int n = 10;
	int q[] = new int[n];
	public void enqueue(Scanner sc)
	{
		if(Front==(Rear+1)%n)
		{
			System.out.println("Queue is overflow...");
		}
		else
		{
			System.out.println("Enter data:");
			int i = sc.nextInt();
			if(Front == -1 && Rear == -1 )
			{
				Front = Rear = 0;
				q[Rear] = i;
			}
			else
			{
				Rear = (Rear+1)%n;
				q[Rear] = i;
			}
		}
	}
	
	void dequeue()
	{
		if(Front==-1 && Rear==-1)
		{
			System.out.println("Queue is empty...");
		}
		else if(Front==Rear)
		{
			System.out.println("Queue is underflow/empty");
		}
		else
		{
			Front = (Front+1)%n;
		}
	}
	
	void display()
	{
		int i;
		System.out.println("Items are....");
		for( i=Front; i!=Rear ; i= (i+1)%n)
		{
		   System.out.print(q[i]+" ");	
		}
		System.out.print(q[i]+" ");
	}
}
public class CircularQueue
{
  public static void main(String[] args)
  {
	  queue ob = new queue();
//	  int d;
	  Scanner s = new Scanner(System.in);
	  while(true)
	  {
	  System.out.println("=======Choice=====");
	  System.out.println("1.enqueue\n2.dequeue\n3.display");
	  int ch = s.nextInt();
	  switch(ch)
	  {
	  case 1:
		  ob.enqueue(s);
		  break;
	  case 2:
		  ob.dequeue();
		  break;
	  case 3:
		  ob.display();
		  break;
	  }
    }
  }
}