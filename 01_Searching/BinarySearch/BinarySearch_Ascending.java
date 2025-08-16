// SEARCH FOR AN ELEMENT IN THE GIVEN INCREASING SORTED ARRAY USING BINARY SEARCH


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
		int target=in.nextInt();
	    System.out.println(BinarySearch(arr,target));
	}
	static int BinarySearch(int[] arr,int target){
		int start=0,end=arr.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==target){
				return mid;
			}
			else if (arr[mid]>target){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return -1;
	}
}
