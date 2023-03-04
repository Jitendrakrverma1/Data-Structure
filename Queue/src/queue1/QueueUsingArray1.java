package queue1;

import java.util.Scanner;
public class QueueUsingArray1 
{
	int Front = -1, Rear = -1;
	int n = 10;
	int a[] = new int[n];
	public void enqueue(Scanner sc)
	{
		if(Rear == n-1)
		{
			System.out.println("overflow condition..");
		}
		else
		{
			System.out.println("Enter data:");
			int i = sc.nextInt();
			if(Front==-1 && Rear==-1)
			{
				Front = 0;
				Rear = 0;
				a[Rear] = i;
			}
			else
			{
				Rear = Rear + 1;
				a[Rear] = i;
			}
		}
	}
	
	public void dequeue()
	{
		if(Front== -1 && Rear== -1)
		{
			System.out.println("Queue is underflow..");
		}
		else
		{
			Front = Front + 1;
		}
	}
	
	public void display()
	{
		System.out.println("Items are:");
		for(int i=Front ; i<=Rear ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
   public static void main (String[] args)
   {
	  Scanner sc = new Scanner(System.in);
	  QueueUsingArray1 ob = new QueueUsingArray1 ();
	  while(true)
	  {
		  System.out.println("=======choice=======");
		  System.out.println("1.enqueue\n2.dequeue\n3.display\n4.exit");
		  int ch = sc.nextInt();
		  switch(ch)
		  {
		  case 1:
			  ob.enqueue(sc);
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
