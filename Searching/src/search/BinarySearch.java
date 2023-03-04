                              /* Binary Search */
// It is apply on sorted array.
/*
    step-1: mid = [LB+UB]/2;
    step-2: if(a[mid]==Item) return,  and goto step-1;
    step-3: if(Item>a[mid]) return LB=mid+1; and goto step-1;
    step-4: if(Item<a[mid]) return UB=mid-1; and goto step-1;
 
 */
package search;
import java.util.Scanner;

public class BinarySearch
{
  @SuppressWarnings("resource")
public static void main(String[] args)
  {
	 int n , i , LB=0 , UB ,data, mid=0,count=0;
	 int a[];
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("How many element you want to insert:");
	 n = sc.nextInt();
	 a = new int[n];
	 UB = n-1;
	 
	 System.out.println("Enter the element of array:");
	 for(i=0;i<n;i++)
	 {
		 a[i] = sc.nextInt();
	 }
	 
	 System.out.println("Enter the element to be searched:");
	 data = sc.nextInt();
	 while(LB<=UB)
	 {
		 mid = (LB+UB)/2;
		 if(data==a[mid])
		 {
			 count++;
			 break;
		 }
		 else if(data>a[mid])
		 {
			 LB = mid+1;
		 }
		 else if(data<a[mid])
		 {
			 UB = mid-1;
		 }
	 }
	 
	 if(count>0)
	 {
		 System.out.print("Item found at:"+mid);
	 }
	 else {
		 System.out.println("Item not found....");
	 }
  }
}
