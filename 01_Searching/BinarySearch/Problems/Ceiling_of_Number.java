// A target is given, if target exists in the array return it,else return element greater than the element


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
		int mid;
		while(start<=end){
			mid=(start+(end-start))/2;
			if(arr[mid]==key){
				return arr[mid];
			}
			else if (arr[mid]>key){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return arr[start];
	}
}
