
                   /* Bubble Sort */
package search;
import java.util.Scanner;
public class BubbleSort 
{
   @SuppressWarnings("resource")
public static void main(String[] args)
   {
	   int n, i, j, arr[], temp;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("How many elements you want to insert:");
	   n = sc.nextInt();
	   arr = new int[n];
	   System.out.println("Enter the element of array:");
	   for( i=0; i<n; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   n = arr.length;
	   for(i=0; i<n-1; i++)
	   {
		   for(j=0; j<n-i-1;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
			   temp = arr[j];
			   arr[j] = arr[j+1];
			   arr[j+1] = temp;
			   }
		   }
	   }
	   System.out.println("After sorting the array:");
	   for(int k:arr)
	   {
		   System.out.print(k+" ");
	   }
   }
}
