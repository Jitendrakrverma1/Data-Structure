package search;
import java.util.Scanner;

public class LinearSearch 
{
   public static void main(String[] args)
   {
	   @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	   int n ,i ,data , counter=0;
	   int arr[];
	   System.out.println("How many data you want to insert:");
	   n = sc.nextInt();
	   arr = new int[n];
	   
	   System.out.println("Enter the elements of array:");
	   for(i=0; i<n; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   System.out.println("enter the data to be searched:");
	   data = sc.nextInt();
	   for(i=0; i<n; i++)
	   {
		   if(arr[i]==data)
		   {
			   counter++;
			  break;
		   }
	   }
	   
	   if(counter>0) {
		   System.out.println("Item found at "+i);
	   }
	   else {
		   System.out.println("Item not found");
	   }
   }
}
