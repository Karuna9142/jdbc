package com.array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int arr1[] =new int[arr.length];
		
		System.out.println("enter the element of the array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			arr1[i] = arr[i];
		}
		
		System.out.println("Copied array is:-");
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		

	}

}
