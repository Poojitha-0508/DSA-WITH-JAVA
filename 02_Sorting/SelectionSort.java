import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	    }
		  System.out.println("Sorted in Ascending order: "+Arrays.toString(SelectionSort_Ascending(arr)));
      System.out.println("Sorted in Descending order: "+Arrays.toString(SelectionSort_Descending(arr)));

	}
	
	static int[] SelectionSort_Ascending (int[] arr){
	    for(int i=0;i<arr.length;i++){
	        int min=i;
	        
	        for(int j=i+1;j<arr.length;j++){
	            if (arr[j]<arr[min]){
	                min=j;
	            }
	        }
	        
	        if(arr[i]!=arr[min]){
	            int temp=arr[i];
	            arr[i]=arr[min];
	            arr[min]=temp;
	        }
	    }
	    return arr;
	}
	static int[] SelectionSort_Descending(int[] arr){
	    for(int i=0;i<arr.length;i++){
	        int max=i;
	        
	        for(int j=i+1;j<arr.length;j++){
	            if (arr[j]>arr[max]){
	                max=j;
	            }
	        }
	        
	        if(arr[i]!=arr[max]){
	            int temp=arr[i];
	            arr[i]=arr[max];
	            arr[max]=temp;
	        }
	    }
	    return arr;
	}
}
