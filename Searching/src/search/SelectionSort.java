                                 
                            /* selection sort */
package search;
import java.util.Scanner;

public class SelectionSort 
{ @SuppressWarnings("resource")
public static void main(String[] args)
  {
	 int n, i, j, loc, a[], temp;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("How many element you want to insert:");
	 n = sc.nextInt();
	 
	 a = new int[n];
	 
	 n = a.length;
	 System.out.println("Enter the element of array:");
	 for(i=0; i<n; i++)
	 {
		 a[i] = sc.nextInt();
	 }
	 
	 // starting the selection sort 
	 for(i=0;i<n-1;i++)
	 {
		 loc = i;
		 for(j=i+1;j<n;j++)
		 {
			if(a[j]<a[loc])
			{
				loc = j;
			}
		 }
		temp = a[i];
		a[i] = a[loc];
		a[loc] = temp;
	 }
	 
	 System.out.println("After sorting the array:");
	 for(int k: a)
	 {
		 System.out.print(k+" ");
	 }
	 sc.close();
  }
}
