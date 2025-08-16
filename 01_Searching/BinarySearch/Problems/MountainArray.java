// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    int[] arr = new int[n];
	    for (int i=0;i<n;i++){
	        	arr[i]=in.nextInt();
		}
	    System.out.println(BinarySearch(arr));
	}
	static int BinarySearch(int[] arr){
		int start=0,end=arr.length-1;
		int mid;
		while(start<=end){
			mid=(start+(end-start))/2;
			if(mid<end && arr[mid]>arr[mid+1]){
				end=mid;
			}
			else{
				start=mid+1;
			}
		}
		return arr[end];
	}
}
