// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.*;
class Main {
    public static void main(String[] args){
        int[] arr={1,2,2,2,2,2,3};
        int key=2;
        int[] ans = {-1,-1};
		int start=Search(arr,key,true);
		ans[0]=start;
		if (ans[0]!=-1){
	    	ans[1]=Search(arr,key,false);
		}
		System.out.println(Arrays.toString(ans));	
    }
	static int Search(int[] arr,int key,boolean findStartIndex){
	    int start=0,end=arr.length-1;
		int ans=-1;
		while(start<=end){
			int mid=(start+end)/2;
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
    
