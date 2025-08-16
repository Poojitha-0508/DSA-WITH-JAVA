// https://leetcode.com/problems/find-the-duplicate-number/description/



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
	    
		System.out.println(FindDuplicate(arr));
	}
	static int FindDuplicate(int[] arr){
	    int i=0;
	    while(i<arr.length){
	        int correct=arr[i]-1;
	        if(arr[i]!=arr[correct]){
	            int temp=arr[i];
	            arr[i]=arr[correct];
	            arr[correct]=temp;
	        }
	        else{
	            i++;
	        }
	    }
	    for(i=0;i<arr.length;i++){
	        if(i+1!=arr[i]){
	            return arr[i];
	        }
	    }
	    return -1;
	}
}
