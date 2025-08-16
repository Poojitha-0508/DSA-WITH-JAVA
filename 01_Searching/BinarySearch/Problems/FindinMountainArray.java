// https://leetcode.com/problems/find-in-mountain-array/description/

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

	    int pivot=findPivot(arr);
	    int index=BinarySearch(arr,key,0,pivot);
	    if (index!=-1){
	        System.out.println(index);
	    }else{
	        System.out.println(BinarySearch(arr,key,pivot,n-1));
	    }
	    
	}
	static int findPivot(int[] arr){
		int start=0,end=arr.length-1;
		while(start<=end){
			int mid=(start+(end-start))/2;
			if(mid<end && arr[mid]>arr[mid+1]){
				end=mid;
			}
			else{
				start=mid+1;
			}
		}
		return end;
	}
	static int BinarySearch(int[] arr,int key,int start,int end){
		while(start<=end){
			int mid=(start+(end-start))/2;
			if(arr[mid]==key){
				return mid;
			}
			else if (arr[mid]>key){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return -1;
	}
}
