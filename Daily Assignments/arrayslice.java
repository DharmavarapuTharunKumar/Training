package com;

public class ArraySlice {
	public static int[] sliceArray(int[] array,int startIndex,int endIndex) {
		if(startIndex<0||endIndex>=array.length||startIndex>endIndex) {
			throw new IllegalArgumentException("Invalid start or end index");
		}
		int[]slicedArray=new int[endIndex-startIndex+1];
		int j=0;
		for(int i=startIndex;i<=endIndex;i++) {
			slicedArray[j++]=array[i];
		}
	
		return slicedArray;

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,7,8,8,9,4,6,8,8,6};
		int startIndex=2;
		int endIndex=5;
		int[] slicedArray=sliceArray(array, startIndex, endIndex);
		for(int num:slicedArray) {
			System.out.print(num);
		}

	}

}
