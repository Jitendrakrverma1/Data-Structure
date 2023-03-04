package search;
import java.util.Scanner;

public class MergeSort 
{
	void merge(int arr[], int start, int mid, int end)
	{
		int l = mid-start+1;
		int r = end-mid;
		int left_SubArray[] = new int[l];
		int right_SubArray[] = new int[r];
		for(int i=0; i<l;++i)
		{
			left_SubArray[i] = arr[start+i]; 
		}
		for(int j=0; j<r;++j)
		{
			right_SubArray[j] = arr[mid+1+j]; 
		}
		int i=0,j=0;
		int k=start;
		while(i<l && j<r)
		{
			if(left_SubArray[i] <= right_SubArray[j])
			{
				arr[k] = left_SubArray[i];
				i++;
			}
			else {
				arr[k] = right_SubArray[j];
				j++;
			}
			k++;
		}
		while(i<l)
		{
			arr[k] = left_SubArray[i];
			i++;
			k++;
		}
		while(j<r)
		{
			arr[k] = right_SubArray[j];
			j++;
			k++;
		}
	}
	
	void mergesort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	{
		
	}
  public static void main(String[] args)
  {
	 int i, j, n, arr[];
	 Scanner sc = new Scanner(System.in);
	 System.out.println("How many elelment you wan to insert:");
	 n = sc.nextInt();
	 arr = new int[n];
	 System.out.println("ENter the element of Array:");
	 for(i=0; i<n; i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 MergeSort m = new MergeSort();
	 m.mergesort(arr,0,n-1);
	 for(int k:arr) {
		 System.out.print(k+" ");
	 }
  }
}
