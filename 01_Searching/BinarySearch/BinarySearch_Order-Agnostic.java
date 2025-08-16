// SEARCH FOR AN ELEMENT IN THE ARRAY(BOTH ASCENDING AND DESCENDING) USING BINARY SEARCH

import java.util.*;
public class Main2
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
        boolean Asc=false;
        if (arr[start]<arr[end]){
            Asc=true;
        }
		while(start<=end){
			mid=(start+end)/2;
			if(arr[mid]==key){
				return mid;
			}
			if(Asc==true){
                if (arr[mid]>key){
				    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (arr[mid]>key){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
		}
		return -1;
	}
}
