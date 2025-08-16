//  https://leetcode.com/problems/split-array-largest-sum/
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
	    int m=in.nextInt();
		System.out.println(splitArray(arr,m));
	}
	
	static int splitArray(int[] arr,int m){
	    int start=-1;
	    int end=0;
	    
	    for (int num : arr){
	        if(num > start){
	            start = num;
	        }
	        end = end + num;
	    }
	    while(start < end){
	        int mid = (start + end) / 2;
	        int sum = 0;
	        int pieces = 1;
	        for(int num : arr){
	            if(sum + num > mid){
	                sum = num;
	                pieces++;
	            }
	            else{
	                sum += num;
	            }
	        
	        }
	        
	        
	        if (pieces > m){
	            start = mid+1;
	        }else{
	            end = mid;
	        }
	    }
	    return end;
	}
	
}
