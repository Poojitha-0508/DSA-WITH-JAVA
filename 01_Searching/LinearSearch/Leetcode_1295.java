// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

// General Method
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
	    System.out.println(findcount(arr));
	}
	static int findcount(int[] arr){
	    int count=0;
	    for(int num:arr){
	        if(findeven(num)){
	            count++;
	        }
	    }
	    return count;
	}
	static boolean findeven(int num){
	    int c=0;
	    while(num>0){
	        c++;
	        num/=10;
	    }
	    return c%2==0;
	}
}

// Optimal Method
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
	    System.out.println(findcount(arr));
	}
	static int findcount(int[] arr){
	    int count=0;
	    for(int num:arr){
			if(num<0){
				num=num*-1;
			}
	        if(findeven(num)){
	            count++;
	        }
	    }
	    return count;
	}
	static boolean findeven(int num){
	    int c=(int)(Math.log10(num))+1;
	    return c%2==0;
	}
}
