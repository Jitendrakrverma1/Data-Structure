                                /* Insertion Sort */
/*
 Algorithm:-
   step-1: InsertionSort(A[max], item)
   step-2: set k=1;
   step-3: for k=1 to (n-1)
           {
    step-4:        set temp = a[k]
   step-5:         set j = k-1;
    step-6:       while (temp<a[j]) and (j>=0) 
    step-7:             set a[j+1] = a[j];
   step-8:              j = j-1;
                 
   step-9:       A[j+1] = temp;
   step-10:       exit.
  */
package search;
import java.util.Scanner;
public class InsertionSort
{
//	public static void insertsortExample(int arr[],int n)
//	{
//		for(int i=0; i<n; i++)
//		{
//			int temp = arr[i];
//			int j = i-1;
//			while(j>-1 && temp<arr[j])
//			{
//				arr[j+1] = arr[j];
//				j = j-1;
//			}
//			arr[j+1] = temp;
//		}
//	}
  @SuppressWarnings("resource")
public static void main(String[] args)
  {
//	 int arr[] = {9,14,3,2,43,11,58,22};
	  int arr[];
	  Scanner sc = new Scanner(System.in);
	  System.out.println("How many element you want to insert:");
	  int n = sc.nextInt();
	  arr = new int[n];
	  n = arr.length;
	  
	  System.out.println("Enter the element of arr:");
	  for(int i=0; i<n; i++)
	  {
		  arr[i] = sc.nextInt();
	  }
	  
	 System.out.println("before inertion sort:");
	 for(int i:arr)
	 {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 
	 
                                              //insertsortExample(arr,n);  // calling the function
	 for(int i=0; i<n; i++)
		{
			int temp = arr[i];
			int j = i-1;
			while(j>-1 && temp<arr[j])
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
	 
	 System.out.println("After insertion:");
	 for(int i:arr)
	 {
		 System.out.print(i+" ");
	 }
	 
  }
}
