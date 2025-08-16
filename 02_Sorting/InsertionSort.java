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
		  System.out.println("Sorted in Ascending order: "+Arrays.toString(InsertionSort_Ascending(arr)));
      System.out.println("Sorted in Descending order: "+Arrays.toString(InsertionSort_Descending(arr)));

	}
	
	static int[] InsertionSort_Ascending (int[] arr){
	    for(int i=1;i<arr.length;i++){
	        int key=arr[i];
	        int j=i-1;
	        while(j>=0 && key<arr[j]){
	            arr[j+1]=arr[j];
	            j--;
	        }
	        arr[j+1]=key;
	    }
	    return arr;
	}
	static int[] InsertionSort_Descending (int[] arr){
	    for(int i=1;i<arr.length;i++){
	        int key=arr[i];
	        int j=i-1;
	        while(j>=0 && key>arr[j]){
	            arr[j+1]=arr[j];
	            j--;
	        }
	        arr[j+1]=key;
	    }
	    return arr;
	}
}
