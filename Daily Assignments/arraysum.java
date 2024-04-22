package com;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,6,5,7};
		SumOfarray(a, a.length);
		
	}
	public static void SumOfarray(int[] a,int length) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
						
			sum=sum+a[i];
		}
		System.out.println(sum);
		

	}

}
