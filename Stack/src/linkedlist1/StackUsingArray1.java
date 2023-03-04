package linkedlist1;
import java.util.Scanner;
public class StackUsingArray1 
{
	int top = -1;
	int n = 10;
	int a[] = new int[n];
	
	public void push(Scanner s)
	{
		if(top==n-1)
		{
			System.out.println("Stack is Overflow.....");
		}
		else
		{
			System.out.println("Enter data:");
			int i = s.nextInt();
			top = top + 1;
			a[top] = i;
			System.out.println("Item inserted........");
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow.....");
		}
		else
		{
			top = top - 1;
			System.out.println("Item deleted............");
		}
	}
	
	public void display()
	{
		System.out.println("Items are...........");
		for(int i=top ; i>=0 ; i--)
		{
		  System.out.print(a[i]+" ");	
		}
		System.out.println();
	}
  public static void main(String[] args)
  {
	 StackUsingArray1 ob = new StackUsingArray1(); 
	Scanner s = new Scanner(System.in);
	 while(true)
	 {
		 System.out.println("======Enter your choice======");
		 System.out.println("1.push\n2.pop\n3.display\n4.exit.");
         int d = s.nextInt();
         switch(d)
         {
         case 1:
        	 ob.push(s);
        	 break;
         case 2:
        	 ob.pop();
        	 break;
         case 3:
        	 ob.display();
        	 break;
         case 4:
        	 System.out.println("Stack operation ended...");
        	 System.exit(0);
         }
	 }
  }
}



