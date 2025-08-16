// https://leetcode.com/problems/missing-number/


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
	    
		System.out.println(MissingNumber(arr));
	}
	static int MissingNumber(int[] arr){
	    int i=0;
	    while(i<arr.length){
	        int correct=arr[i];
	        if(arr[i]<arr.length && arr[i]!=arr[correct]){
	            int temp=arr[i];
	            arr[i]=arr[correct];
	            arr[correct]=temp;
	        }
	        else{
	            i++;
	        }
	    }
	    for(i=0;i<arr.length;i++){
	        if(i!=arr[i]){
	            return i;
	        }
	    }
	    return arr.length;
	}
}
