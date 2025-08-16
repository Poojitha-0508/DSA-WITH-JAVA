//  https://leetcode.com/problems/split-array-largest-sum/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	    }
	    int m=in.nextInt();
	    System.out.println(splitArray(arr,m));
	}
	
	public static int splitArray(int[] arr,int m){
	    int min=arr[0],max=0;
	    for(int i=0;i<arr.length;i++){
	        if(min>arr[i]){
	            min=arr[i];
	        }
	        max=max+arr[i];
	    }
	    
        int mid;
	    while(min<max){
	        mid=(min+(max-min))/2;
	        
	        int pieces=1;
	        int sum=0;

	        for(int num:arr){
	            if(sum+num>mid){
	                sum=num;
	                pieces++;
	            }else{
	                sum+=num;
	            }
	        }
	        
	        
	        if(pieces>m){
	            min=mid+1;
	        }else{
	            max=mid-1;
	        }
	    }
	    return max;
	}
}
