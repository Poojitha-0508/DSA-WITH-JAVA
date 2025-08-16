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
		int index;
	    int pivot=findPivotWIthDuplicates(arr);
	    if (pivot==-1){
	        index=BinarySearch (arr, key, 0 ,n-1);
	    }else if(arr[pivot]==key){
	        index=pivot;
	    }else{
    	    index=BinarySearch (arr, key, 0,pivot);
    	    if (index==-1){
    	        index=BinarySearch (arr, key, pivot ,n-1);
    	    }
	    }
	    System.out.println (index);
	    
	}
	static int findPivotWIthDuplicates(int[] arr){
		int start=0,end=arr.length-1;
		while(start<=end){
		    int mid=(start+(end-start))/2;
		    if (mid<end && arr[mid]>arr[mid+1]){
		        return mid;
		    }
		    else if(mid>start && arr[mid]<arr[mid-1]){
		        return mid-1;
		    }
		    else if(arr[start]==arr[mid] && arr[mid]==arr[end]){
		        if(start<end && arr[start]>arr[start+1]){
		            return start;
		        }
		        if(end>start && arr[end]<arr[end-1]){
		            return end-1;
		        }
		    }
		    else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
		        start=mid+1;
		    }else{
		        end=mid-1;
		    }
		    
		}
		return -1;
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
