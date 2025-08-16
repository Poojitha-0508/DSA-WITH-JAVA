// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


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
		System.out.println(Arrays.toString(AnsSearch(arr,key)));
	}
	static int[] AnsSearch(int[] arr,int key){
		int[] ans = {-1,-1};
		int start=Search(arr,key,true);
		ans[0]=start;
		if (ans[0]!=-1){
	    	ans[1]=Search(arr,key,false);
		}
		return ans;
	}
	static int Search(int[] arr,int key,boolean findStartIndex){
	    int start=0,end=arr.length-1;
		int ans=-1;
		while(start<=end){
			int mid=(start+(end-start))/2;
		    if (arr[mid]>key){
				end=mid-1;
			}
			else if(arr[mid]<key){
				start=mid+1;
			}else{
			    ans=mid;
			    if(findStartIndex){
			        end=mid-1;
			    }else{
			        start=mid+1;
			    }
			}
		}
		return ans;
	}
	
}
