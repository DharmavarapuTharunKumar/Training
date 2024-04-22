package com;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array= {12,5,6,7,8,9};
		int x=find_average(Array);
		System.out.println(x);

	}
	public static int find_average(int[] Array) {
		int average=0;
		int sum=12+5+6+7+8+9;
	    average=sum/Array.length;  
		return average;
	}
}
