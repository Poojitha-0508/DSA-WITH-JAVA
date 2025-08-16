// SEARCH FOR AN ELEMENT IN THE GIVEN DECREASING SORTED ARRAY USING BINARY SEARCH


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
		int key=in.nextInt();
	    System.out.println(BinarySearch(arr,key));
	}
	static int BinarySearch(int[] arr,int key){
		int start=0,end=arr.length-1;
		while(start<=end){
			int mid=(start+(end-start))/2;
			if(arr[mid]==key){
				return mid;
			}
			else if (arr[mid]>key){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return -1;
	}
}
