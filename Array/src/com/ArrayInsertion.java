package com;
import java.util.*;
public class ArrayInsertion 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of element in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n+1];
		System.out.print("Enter data:");
		for(int i=0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index of new value to be inserted:");
		 int m = sc.nextInt();
		 System.out.println("Enter new value to be inserted:");
		 int p = sc.nextInt();
		 for(int i=0; i<n+1; i++)
		 {
			 if(i<m)
			 {
				 b[i] = a[i];
			 }
			 else if(i==m)
			 {
				 b[i] = p;
			 }
			 else {
				 b[i]=a[i-1];
			 }
		 }
		 System.out.print("Elements are:");
			for(int arr1:b)
			{
				System.out.print(arr1+" ");
			}
			System.out.println();
		System.out.print("Elements are:");
		for(int arr:a)
		{
			System.out.print(arr+" ");
		}
	}

}
