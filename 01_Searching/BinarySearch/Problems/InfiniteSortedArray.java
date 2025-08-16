// Search for an element in Infinite Sorted Array


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
		System.out.println(AnsSearch(arr,key));
	}
	static int  AnsSearch(int[] arr,int key){
	    int start=0,end=1;
	    while(key>arr[end]){
	        int newStart=end+1;
	        end=end+(end-start+1)*2;
	        start=newStart;
	    }
	    return Search(arr,key,start,end);
	}
	static int Search(int[] arr,int key,int start,int end){
		while(start<=end){
			int mid=start+(end-start)/2;
		    if (arr[mid]>key){
				end=mid-1;
			}
			else if(arr[mid]<key){
				start=mid+1;
			}else{
			    return mid;
			}
		}
		return -1;
	}
	
}
