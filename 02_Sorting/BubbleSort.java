import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in= new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for (int i=0;i<n;i++){
	        arr[i] = in.nextInt();
	    }
	    System.out.println("Sorted in Ascending order: "+Arrays.toString(BubbleSort_Ascending(arr)));
	    
		System.out.println("Sorted in Ascending order(optimised): "+Arrays.toString(BubbleSort_Ascending_opt(arr)));
		
		System.out.println("Sorted in Descending order: "+Arrays.toString(BubbleSort_Descending(arr)));
		
		System.out.println("Sorted in Descending order(optimised): "+Arrays.toString(BubbleSort_Descending_opt(arr)));

	    
	}
	static int[] BubbleSort_Ascending(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1-i;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    return arr;
	}
	static int[] BubbleSort_Ascending_opt(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        boolean swap=false ; // check if swaps occur or not
	        for(int j=0;j<n-1-i;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                swap=true; //true if even one swap is occured
	            }
	        }
	        if(!swap){ //if there is no swaps,then the arr is already sorted
	            return arr;
	        }
	    }
	    return arr;
	}
	static int[] BubbleSort_Descending(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1-i;j++){
	            if(arr[j]<arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    return arr;
	}
	static int[] BubbleSort_Descending_opt(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        boolean swap=false ;
	        for(int j=0;j<n-1-i;j++){
	            if(arr[j]<arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                swap=true;
	            }
	        }
	        if(!swap){
	            return arr;
	        }
	    }
	    return arr;
	}
}
